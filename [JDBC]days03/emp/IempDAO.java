package days03.emp;

import java.util.List;

public interface IempDAO {

	//모든사원정보 출력
	List<empDTO> getEmpAllList();
	
	//사원추가
	int addEmp();
	
}
