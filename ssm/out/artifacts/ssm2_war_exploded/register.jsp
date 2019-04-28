<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String basePath = request.getScheme()+"://"+request.getServerName() + ":" +request.getServerPort() + request.getContextPath()+"/";
 %>
  <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="admin/registerAction!register" method="post">
 <input type="text" name="admin.adminName" value="ssm"/>
  <input type="text" name="admin.adminPass" value="666666"/>
   <input type="submit"  value="注册"/>
</form>
<a href="register2.jsp">第二个功能</a>
<a href="message/messageManagerAction!searchMessageAll">第三个功能</a>
</body>
</html>