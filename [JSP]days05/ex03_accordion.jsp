<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>

<%@page import="java.util.Hashtable"%>
<%@page import="days03.EmpDTO"%>
<%@page import="days02.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  /* 
  ArrayList<DeptDTO> deptList = (ArrayList<DeptDTO>)request.getAttribute("deptList");
  ArrayList<EmpDTO>  empList  = (ArrayList<EmpDTO>)request.getAttribute("empList");
  String name = (String) request.getAttribute("name");
  */
  
  LinkedHashMap<String, ArrayList<EmpDTO>> ht =
		    (LinkedHashMap<String, ArrayList<EmpDTO>>)
		    request.getAttribute("ht");
  /* 
  Hashtable<String, ArrayList<EmpDTO>> ht =
    (Hashtable<String, ArrayList<EmpDTO>>)
    request.getAttribute("ht");
   */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2018. 8. 24. 오전 10:12:10</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
 
  #accordion-resizer {
    padding: 10px;
    width: 350px;
    height: 300px;
  }
  
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
  $( function() {
	  $( "#tabs" ).tabs();  // 
	  
	  //$( "#accordion" ).accordion();
	  
	 
      $( "#accordion" ).accordion({
        heightStyle: "fill"
      });
	  
      $( "#accordion-resizer" ).resizable({
	      minHeight: 140,
	      minWidth: 200,
	      resize: function() {
	        $( "#accordion" ).accordion( "refresh" );
	      }
 	  });
    
      
  } );
</script>

</head>
<body>

<%-- <h3>ex03_accordion.jsp - <%= name %> - EL : ${ name }</h3> --%>
<h3>Accordion</h3>

<div id="accordion-resizer" class="ui-widget-content">
  <div id="accordion">  
    
    <%
      Set<Entry<String, ArrayList<EmpDTO>>> set = ht.entrySet();
      Iterator<Entry<String, ArrayList<EmpDTO>>> ir = set.iterator();
      while( ir.hasNext() ){
    	Entry<String, ArrayList<EmpDTO>> entry = ir.next();
    %>
    <h3><%= entry.getKey() %> 번 부서</h3>
    <div>
      <p>
        <ol>
        <%
           ArrayList<EmpDTO> empList = entry.getValue();
           Iterator<EmpDTO> empIr = empList.iterator();
           while(empIr.hasNext()){
        	   EmpDTO dto =  empIr.next();
        %>
        <li>
          <%= dto.getEmpno() %> / <%= dto.getEname() %>  
        </li>
        <%	   
           }
        %>
        </ol>
      </p>
    </div> 
    <%	  
      }
    %>
     
  </div>
   
</div>

<h3>Tabs</h3>
<div id="tabs">
  <ul>
    <%
      set = ht.entrySet();
      ir = set.iterator();
      while( ir.hasNext() ){
    	Entry<String, ArrayList<EmpDTO>> entry = ir.next();
    	String deptno = entry.getKey();
    %>
      <li><a href="#tabs-<%=deptno%>"><%=deptno%> 번 부서</a></li>
    <% } %>  
    <!--   
    <li><a href="#tabs-1">Nunc tincidunt</a></li>
    <li><a href="#tabs-2">Proin dolor</a></li>
    <li><a href="#tabs-3">Aenean lacinia</a></li>
    -->
  </ul>

  <%
      set = ht.entrySet();
      ir = set.iterator();
      while( ir.hasNext() ){
    	Entry<String, ArrayList<EmpDTO>> entry = ir.next();
    	String deptno = entry.getKey();
    %>
      <div id="tabs-<%=deptno%>">
	    <p>
	      <ol>
	        <%
	           ArrayList<EmpDTO> empList = entry.getValue();
	           if( empList.size() != 0 ){
	           Iterator<EmpDTO> empIr = empList.iterator();
	           while(empIr.hasNext()){
	        	   EmpDTO dto =  empIr.next();
	        %>
	        <li>
	          <%= dto.getEmpno() %> / <%= dto.getEname() %>  
	        </li>
	        <%	   
	           }
	         }else{
	        %>
	           <li>소속 사원 없음</li>
	        <%	 
	         }
	        %>
          </ol>
        </p>
	  </div>
    <% } %>  
  

</div>


</body>
</html>