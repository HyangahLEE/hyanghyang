package days05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//p 447 OPEN for��
		// ���߷ο츦 ó���ϴ� sql���� ����sql�� �ۼ��ϴ� ���
		
		//open Ŀ�� ���� for
		
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
