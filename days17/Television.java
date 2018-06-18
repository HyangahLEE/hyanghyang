package days17;
// 인터페이스를 구현한 클래스를 "구현클래스" 하고
//                 implements 인터페이스...
public class Television 
     implements RemoteControl {
    // field
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume );
	}

}
