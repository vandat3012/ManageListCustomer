<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 27/02/2024
  Time: 3:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer" method="post">
    <table border="1px">
        <tr>
            <td>Id</td>
            <td><input type="text" name="id" value="${customer.id}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${customer.name}"></td>
        </tr>
        <tr>
            <td>Id</td>
            <td><input type="text" name="email" value="${customer.email}"></td>
        </tr>
        <tr>
            <td>Id</td>
            <td><input type="text" name="address" value="${customer.address}"></td>
        </tr>
        <tr>
            <button type="submit">Update</button>
        </tr>
    </table>
</form>
</body>
</html>
