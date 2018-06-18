package days28;

class DataBox{

	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
			String returnValue = data;
			System.out.println("Customer 가 읽은 데이터 : " +returnValue);
			data = null;
			notify();
			return returnValue;
		}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread 가 생성한 데이터 : "+ data);
		notify();
		}
	}

class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
		
	}
	@Override
	public void run() {
		
		for (int i = 1; i <=3; i++) {
			String data = "Data - " +i;
			dataBox.setData(data);
		}
	}	
}

class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
		
	}
	@Override
	public void run() {
		
		for (int i = 1; i <=3; i++) {
			String data = dataBox.getData();
		}
	}	
}


public class Ex06 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread pt = new ProducerThread(dataBox);
		ConsumerThread ct = new ConsumerThread(dataBox);

		
		pt.start();
		ct.start();
	}

}
