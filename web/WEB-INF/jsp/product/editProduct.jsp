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
    <title>EDIT PRODUCT</title>
</head>
<body>
<div style="margin: 0px auto;width: 500px">
    <form action="updateProduct" method="post">
        name: <input type="text" name="product.name" value="${product.name}"> <br>
        <input type="hidden" name="product.id" value="${product.id}">
        <input type="submit" value="提交">
    </form>
</div>
<s:debug/>

</body>
</html>
