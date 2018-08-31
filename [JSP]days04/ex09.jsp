<%@page import="days03.EmpDTO"%>
<%@page import="days02.DeptDTO"%>
<%@page import="com.util.DBConn"%>
<%@ page import="java.util.*,java.sql.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String sql = " select deptno, dname from dept ";
	Connection con = DBConn.getConnection();

	ArrayList<DeptDTO> list = null;
	try (PreparedStatement stmtdept = con.prepareStatement(sql)) {
		ResultSet rsdept = stmtdept.executeQuery();
		list = new ArrayList<>();
		while (rsdept.next()) {

			int deptno = rsdept.getInt(1);
			String dname = rsdept.getString(2);
			DeptDTO dto = new DeptDTO(deptno, dname);
			list.add(dto);
			System.out.printf("\n>[%d]\t [%s]\n", deptno, dname);
		}

		rsdept.close();
		DBConn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<%
	String pdeptno = request.getParameter("deptno");

	sql = " select empno , ename, job, mgr, hiredate, sal, deptno from emp ";

	sql += " where deptno= ? ";

	con = DBConn.getConnection();
	ArrayList<EmpDTO> emplist = null;
	if (pdeptno == null)
		pdeptno = "10";
	try (PreparedStatement stmt = con.prepareStatement(sql)) {
		stmt.setInt(1, Integer.parseInt(pdeptno));
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			emplist = new ArrayList<>();
			do {

				EmpDTO dto = new EmpDTO();

				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setDeptno(rs.getInt("deptno"));

				emplist.add(dto);

				//System.out.printf("%d\t %s\t %s\t %d\t %s\t %.2f\t %d\t", empno, ename,job, mgr, hiredate, sal,  deptno);
			} while (rs.next());
		}
		rs.close();
		DBConn.close();

		//System.out.println(emplist.size());
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<%!
public String getSelected(int deptno, int pdeptno){
	return (deptno ==pdeptno)? "selected": "";	
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style>
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#deptno").change(function(){
		$("form").submit();
		
	})
});
</script>
</head>
<body>
	<div class="container" style="width: 600px; margin: 0 auto;">
		<form action="">
			<select class="form-control" name="deptno" id="deptno">
				<%
					Iterator<DeptDTO> ir = list.iterator();
					while (ir.hasNext()) {
						DeptDTO dto = ir.next();
						int dno = dto.getDeptno();
				%>
				<option value="<%=dno%>" <%=getSelected(dno,Integer.parseInt(pdeptno))%>><%= dto.getDname() %></option>
				<%
					}
				%>
			</select>
		</form>
		<h3><%=pdeptno%>
			사원 정보 출력
		</h3>
		<table class="table table-hover">
			<thead class="thead-light">
				<tr>
					<th>deptno</th>
					<th>empno</th>
					<th>ename</th>
					<th>job</th>
					<th>mgr</th>
					<th>hiredate</th>
					<th>sal</th>
				</tr>
			</thead>

			<tbody>
				<%
					if (emplist == null) {
				%>
				<tr>
					<td colspan="5" style="text-align: center; width: 100%; color:red;" ><b>No Exist</b></td>
				</tr>
				<%
					} else {
				%>
				<%
					Iterator<EmpDTO> empir = emplist.iterator();
						while (empir.hasNext()) {
							EmpDTO emp = empir.next();
				%>
				<tr>
					<td><%=emp.getDeptno()%></td>
					<td><%=emp.getEmpno()%></td>
					<td><%=emp.getEname()%></td>
					<td><%=emp.getJob()%></td>
					<td><%=emp.getMgr() %></td>
					<td><%=emp.getHiredate()%></td>
					<td><%=emp.getSal()%></td>
				</tr>

				<%
					}
				%>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
<script type="text/javascript">
$("#deptno > option[value='<%=pdeptno%>']").attr("selected","selected");
</script>
</body>
</html>