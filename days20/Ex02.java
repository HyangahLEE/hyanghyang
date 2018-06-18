package days20;

public class Ex02 {

	public static void main(String[] args) {
		// String.join()
		String [] names = {"이석화","김재곤","이혜원","박주영"};
		// "이석화-김재곤-이혜원-박주영"
		String data = String.join("-", names);
		System.out.println(data);
		/*
		String data = "";
		for (int i = 0; i < names.length; i++) {
			data += names[i]+"-";
		}
		System.out.println(data);
		*/

	}

}




