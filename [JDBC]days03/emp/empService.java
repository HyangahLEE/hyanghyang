package days03.emp;

import java.util.List;

public class empService {

	private empDAOImpl empDAO = null;

	public void setEmpDAO(empDAOImpl empDAO) {
		this.empDAO = empDAO;
	}

	public empService(empDAOImpl empDAO) {
		super();
		this.empDAO = empDAO;
	}
	
	public List<empDTO> getEmpAllListService(){
		
		return this.empDAO.getEmpAllList();
		
	}
	
	public int getAddEmpService() {
		return this.empDAO.addEmp();
	}
	
	
}
