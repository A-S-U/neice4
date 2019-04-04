<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-02-25
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title></title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="0">
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>年龄</th>
    <th>家庭住址</th>
    <th>Email</th>
  </tr>

  <c:forEach items="${membersInfos}" var="membersInfo">
      <tr>
        <td>${membersInfo.Mid}</td>
        <td>${membersInfo.Mname}</td>
        <td>${membersInfo.Mgender}</td>
        <td>${membersInfo.Mage}</td>
        <td>${membersInfo.Maddress}</td>
        <td>${membersInfo.Memail}</td>
      </tr>
  </c:forEach>
</table>
</body>
</html>

