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
<title>第二</title>
</head>
<body>
<form action="admin/adminManagerAction!register2" method="post">
 <input type="text" name="admin.adminName" />
  <input type="text" name="admin.adminPass" />
   <input type="submit"  value="注册"/>
</form>

</body>
</html>