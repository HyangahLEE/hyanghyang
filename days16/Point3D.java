package days16;

import java.io.IOException;

import days14.Point;

// The type Point3D cannot subclass the final class Point
//                 Sub클래스             Super클래스
public class Point3D extends Point{ 

	// fields
	private int z;
	
	// getter , setter
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	// default constructor
	public Point3D() {}
	
	// public void dispPoint() {} 상속...
	
	@Override   // 오버라이딩
	public void dispPoint()  //throws IOException, ArrayIndexOutOfBoundsException
	{
		//System.out.println("> X, Y, Z 좌표를 출력하는 메서드");
		/*
		System.out.printf("> x=%d, y=%d, z=%d\n"
				, this.getX(), this.getY(), this.z);
		*/		
		super.dispPoint();
		System.out.printf(">  z=%d\n" , this.z);
	}
	
	// 오버로딩
	public void dispPoint(int z) {
		System.out.println("XXX");
	}
	
	// Cannot override the final method from Point
	// 재정의할 수 없는 메서드 : final 메서드
	/*
	@Override
	public  Point offsetPoint(Point p) {
		return this;
	}
	*/
}
