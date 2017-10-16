<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType = "text/html; charset=UTF-8" %>
<html>
<body>
<h2>本书信息</h2>
<s:form action="update">
<s:textfield label="ISBN" name="ISBN" readonly="true" />
<s:textfield label="Title" name="Title"/>
<s:textfield label="AuthorName" name="AuthorName"/>
<s:textfield label="AuthorAge" name="Age"/>
<s:textfield label="AuthorCountry" name="Country"/>
<s:textfield label="Price" name="Price" />
<s:textfield label="Publisher" name="Publisher" />
<s:textfield label="PublisherDate" name="Date"/>
<s:submit value="update"/>
</s:form>
</body>
</html>