package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// p725 ArrayList
		/*1. Collection - List 인터페이스를 구현한 컬렉션 클래스
			2. 순서 O, 중복 O
			3. 객체가 인덱스로 관리 된다.
			4. 배열처럼 사용 가능 *차이점? arraylist는 동적으로 크키가 변동
		 */

		ArrayList list = new ArrayList(); //크기 10
		//ArrayList list = new ArrayList(16); //크기 16 but 보통 크기값 안줌 왜냐? 지가 알아서 늘어나니까
		list.add("이향아");//인덱스0
		list.add("이수민");//인덱스1
		list.add("김현영");//인덱스2
		list.add("신정연");//인덱스3
		list.add("짐승히");//인덱스4
		list.add(1, "박보연");
		
		
		//[이향아, 이수민, 김현영, 신정연, 짐승히] toString() 오버라이딩..
		System.out.println(list);
		//System.out.println(list.toString());
		//System.out.println(list.size());//요소 5개 (Element) 
		//System.out.println(list.get(4));
		//System.out.println(list.get(6));
		//IndexOutOfBoundsException


		


		//모든 학생 이름 출력
		/*for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}*/

		//신정연 빠짐 list 제거
		/*	boolean b = list.contains("신정연");
		System.out.println(b);*/

		//강퇴시킬애 입력받아 강퇴시키기
		/*		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("누구 강퇴??");
			String name = sc.next();

			int index = list.indexOf(name);
			if(index==-1) {
				System.out.println("그런 학생 없는디용");

			}else {
				list.remove(index);// 리턴값 object
				System.out.println("강퇴~");
			}

				System.out.println(list);
		} catch (Exception e) {

		}*/

		//원하는 값 수정하겠다.
		/*	int idx = list.indexOf("이향아");
		list.set(idx, "이향긔");
		System.out.println(list);*/

		//list의 모든 요소 제거
		/*		list.clear();
		System.out.println(list);
		 */		

		
		/*
		Object[] names = list.toArray();
		for (Object n : names) {
			System.out.println(n);
		}
*/
		//toArray는 Objct 객체로  리턴
		/*Object[] names =  list.toArray();
		for (Object n : names) {
			System.out.println((String)n);
		}
		
		
		System.out.println(list.isEmpty()) ;*///요소가 x true, 요소가 적어도 1개이상있으면 false
		
		
		/*
		ArrayList list2 = new ArrayList(list); 
		
		ArrayList list2 = new ArrayList(); 
		list2.addAll(list);*///둘이 같은 코드
		
		
		//반복자 (iterator) 암기*****- 각 객체를 반복해서 사용할 수 있는 
		/*
		Iterator ir = list.iterator();
		
		while (ir.hasNext()) { /// boolean 다음요소가 있느 알려주고 다음요소를 가리키고 있다.
			String name = (String) ir.next();// next는 가리키는 요소를 가져옴
			System.out.println(name);
		}
		*/
		
		/*
		ListIterator it = list.listIterator();
		list.notify();
		*///list.sort(정렬기준);
		
			
		// ListIterator ir = list.listIterator();  ***
				// list.sort(정렬기준);  -1  0  1
				/*
				List subList =  list.subList(1, 3);  // index  1 2 
				System.out.println( subList );
				*/
				
				// [A][][][D]
				// list.trimToSize();
				
				// p 729
				// Arrays.binarySearch(a, key)
				// Arrays.sort(a); 오름차순
				
				// String []  -> List 변환  : Arrays.asList()
				String [] names = {"김의","강다예","구보모"};
				List  list3 =  Arrays.asList(names);  // String ... a
				System.out.println(list3);
		
		
		
		
		
		

	}

}
