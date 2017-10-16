<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType = "text/html; charset=UTF-8" %>
<html>
<body>
<h2>图书查询结果</h2>
<table>
<s:iterator id="information" value="ISBNlist">
<tr>
<td>
<a href="display.action?ISBN=<s:property value="#information"/>&AuthorName=<s:property value="targetname"/>"><s:property value="#information"/></a>
</td>
<td>
<a href="remove.action?ISBN=<s:property value="#information"/>">remove</a>
</td>
</tr>
</s:iterator>
</table>
</body>
</html>