package days03.emp;

import java.util.List;

public interface IempDAO {

	//��������� ���
	List<empDTO> getEmpAllList();
	
	//����߰�
	int addEmp();
	
}
