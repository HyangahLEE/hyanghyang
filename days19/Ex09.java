package days19;

import days16.NewModelCar;

public class Ex09 {

	public static void main(String[] args) 
			                 throws ClassNotFoundException
			                 , InstantiationException
			                 , IllegalAccessException {
		// p 493 동적 객체 생성 :    newInstance();
		String className = "days16.NewModelCar";
        Class  clz =  Class.forName(className);
        NewModelCar car = (NewModelCar) clz.newInstance();
        
        car.color ="red";
        

	}

}
