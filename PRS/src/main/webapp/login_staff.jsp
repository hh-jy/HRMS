<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录 - 员工人事档案管理系统</title>
    
<%
    Object attribute = request.getAttribute("error");
%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
    
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/stastic/bootstrap-3.4.1-dist/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<script
	src="${APP_PATH}/stastic/bootstrap-3.4.1-dist/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>
</head>
<body class="login_bg">
<section class="loginBox">
    <header class="loginHeader">
        <h1>员工人事档案管理系统</h1>
    </header>
    <section class="loginCont">
<%--        action中地址要改--%>
        <form class="loginForm1" id="emp_login"><!-- action="/PRS/jsp/astaff_frame.jsp"  -->
            <div class="info">${error}</div><!-- 错误提示，待改 -->
            <div class="inputbox">
                <label>用户名：</label>
                <input type="text" class="input-text" id="empId" name="emp_id" placeholder="请输入用户名" required/>
            </div>
            <div class="inputbox">
                <label >密码：</label>
                <input type="password" id="empPasswords" name="emp_pwd" placeholder="请输入密码" required/>
            </div>
            <div class="subBtn">
                <input type="submit" value="登录" id="emp_login_btn"/>
                <input type="reset" value="重置"/ id="emp_login_reset">
            </div>
            <div class="changeType">
                <a href="login_admin.jsp">
                    <p>切换为管理员登录</p>
                </a>
            </div>
        </form>
    </section>
</section>
</body>
<script type="text/javascript">
	$("#emp_login_btn").click(function() {
		alert("登录");
	});
</script>
</html>
