<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.hdiv.org/jsp/jstl/core"%>

<%--
  Created by IntelliJ IDEA.
  User: Luke
  Date: 9/3/17
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>Test</h1>
<%--<c:url value="/temp" var="url3"/>--%>
<%--<a href="${url3}">sdf</a>--%>
<form:form action="/temp" method="post" commandName="bean" id="tempForm">
    <form:textarea path="t" type="text" id="t"/>
    <label for="t">ENTER SOMETHING</label>
    <form:button type="submit">SUBMIT</form:button>
</form:form>
</body>
</html>
