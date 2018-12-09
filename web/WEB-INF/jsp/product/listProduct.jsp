<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tanggl
  Date: 2018/12/9
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>LIST PRODUCT</title>
</head>
<body>
<div style="margin: 0px auto;width: 500px">
    <table cellspacing="0" border="1" width="100%">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>edit</td>
            <td>delete</td>
        </tr>
        <s:iterator value="products" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td><a href="editProduct?product.id=${p.id}">edit</a></td>
                <td><a href="deleteProduct?product.id=${p.id}">delete</a></td>
            </tr>
        </s:iterator>
    </table>
    <br><br>
    <form action="addProduct" method="post">
        name:<input name="product.name"><br>
        <input type="submit" value="submit">
    </form>
</div>
</body>
</html>
<s:debug/>
