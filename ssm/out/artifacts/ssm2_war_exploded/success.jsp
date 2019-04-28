<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String basePath =
    request.getScheme()+"://"+request.getServerName() + ":"
    +request.getServerPort() + request.getContextPath()+"/";
 %>
 <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有发帖</title>
</head>
<body>
显示所有发帖<br>
  
	<s:iterator value="list" var="m">
		<s:property value="#m.messageId"/> <s:property value="#m.title"/>  
	 
		<hr>
	</s:iterator>

</body>
</html>