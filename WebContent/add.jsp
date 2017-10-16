<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType = "text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<h2>添加一本图书</h2>
<s:form action="add">
<s:textfield label="ISBN" name="ISBN"/>
<s:textfield label="Title" name="Title"/>
<s:textfield label="AuthorName" name="AuthorName"/>
<s:textfield label="Price" name="Price"/>
<s:textfield label="Publisher" name="Publisher"/>
<s:textfield label="PublisherDate" name="Date"/>
<s:textfield label="AuthorCountry" name="Country"/>
<s:textfield label="AuthorAge" name="Age"/>
<s:submit value = "add"/>
</s:form>
<a href="/lab2/index.jsp" target=" _self" >返回查询页面</a>
</body>
</html>