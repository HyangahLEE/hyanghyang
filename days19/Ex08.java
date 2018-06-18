package days19;

//                      리플렉트 패키지 안의 클래스
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) 
			             throws ClassNotFoundException {
		
		String className = "days16.NewModelCar";
        Class  clz =  Class.forName(className);
        
        System.out.println("-----------------------------");
        // 선언된 생성자정보들을 얻어오는 메소드 : 
        //           getDeclaredConstructors
        Constructor[] cts = clz.getDeclaredConstructors();
        for (Constructor c : cts) {
			System.out.print(c.getName() +"(");			
			Class[] parameters = c.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				System.out.print( parameters[i].getName() );
				if( i < parameters.length - 1) {
					System.out.print(", ");
				}
			}			
			System.out.println(")");
		}
        
        System.out.println("-----------------------------");
        // p 492 
        // 필드 타입과 필드 이름 출력
        Field [] fields = clz.getDeclaredFields();
        for (Field field : fields) {
			System.out.println(field.getType().getSimpleName()
					+" " + field.getName());
		}
        
        System.out.println("-----------------------------");
        // 메소드 이름과 매개변수 출력
        Method [] methods = clz.getDeclaredMethods();
        for (Method method : methods) {
			System.out.print(method.getName()+"(");
			Class [] parameters = method.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				System.out.print( parameters[i].getName() );
				if( i < parameters.length - 1) {
					System.out.print(", ");
				}
			}	
			System.out.println(")");
		}
        
	}

}
