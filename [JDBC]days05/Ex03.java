package days05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//p 447 OPEN for문
		// 다중로우를 처리하는 sql문을 동적sql로 작성하는 방법
		
		//open 커서 변수 for
		
	}
}

/*
 * CREATE OR REPLACE PROCEDURE up_selectSearchEname
(
    pCursor out sys_refcursor,
  pename in emp.ename%type

)IS
    vsql varchar2(1000);
BEGIN
    vsql := 'select deptno, empno, job from emp ';
    vsql := vsql ||' where ename like :1 ';
    
    open pCursor for vsql
    using '%'|| pename||'%';
END;
*/
