<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Student Details </h2>

<form action="getStudnetDetails" method="POST">
Search with Student Id: <input type="text" name="id"/>
<input type="submit" value="Search"/>
</form>


 <c:if test="${StudentObj != null}">
 Student Name: ${StudentObj.studentName}
 Student Grade: ${StudentObj.studentGrade}
 </c:if>

</body>
</html>