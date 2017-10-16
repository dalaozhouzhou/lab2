<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType = "text/html; charset=UTF-8" %>
<html>
<body>
<h2>输入作者查询</h2>
<s:form action="search">
Author Name: <s:textfield name="targetname"/>
<s:submit value = "search"/>
</s:form>
<br>
<a href="/lab2/add.jsp" target=" _self" >进入添加功能</a>
</body>
</html>