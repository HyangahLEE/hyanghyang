<%@page import="net.sf.json.JSONArray"%>
<%@page import="net.sf.json.JSONObject"%>
<%@page import="com.util.ConnectionProvider"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page trimDirectiveWhitespaces="true"
   contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   Connection conn = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   String sql = "select empno, ename, sal " + " from emp " + " order by sal desc";

   //객체 생성
   JSONObject jsonData = null;

   try {
      conn = ConnectionProvider.getConnection();
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();

      jsonData = new JSONObject();

      //배열 생성
      JSONArray jsonEmpArray = new JSONArray();

      while (rs.next()) {
         int empno = rs.getInt("empno");
         String ename = rs.getString("ename");
         double sal = rs.getDouble("sal");

         //객체 생성
         JSONObject jsonEmp = new JSONObject();

         jsonEmp.put("empno", empno);
         jsonEmp.put("ename", ename);
         jsonEmp.put("sal", sal);

         jsonEmpArray.add(jsonEmp);

      }

      // {"emp" : [] 와 동일
      jsonData.put("emp", jsonEmpArray);

   } catch (Exception e) {
      e.printStackTrace();
   } finally {
      pstmt.close();
      rs.close();
      conn.close();
   }
%>

<%=jsonData%>

