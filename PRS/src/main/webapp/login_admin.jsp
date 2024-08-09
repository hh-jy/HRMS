<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录 - 员工人事档案管理系统</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript">
	/* if(top.location!=self.location){
	      top.location=self.location;
	 } */
    </script>
</head>
<body class="login_bg">

    <%
        Object attribute = request.getAttribute("error");
    %>
    <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>

    <section class="loginBox">
        <header class="loginHeader">
            <h1>员工人事档案管理系统</h1>
        </header>
        <section class="loginCont">
            <%--        action中地址要改--%>
	        <form class="loginForm2" action="${APP_PATH}/jsp/frame.jsp"  name="actionForm" id="adminlogin"  method="post" >
				<div class="info">${error}</div>
                <div class="inputbox">
                    <label>用户名：</label>
					<input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
				</div>	
				<div class="inputbox">
                    <label >密码：</label>
                    <input type="password" id="userPassword" name="userPassword" placeholder="请输入密码" required/>
                </div>	
				<div class="subBtn">
                    <input type="submit" value="登录"/>
                    <input type="reset" value="重置"/>
                </div>
                <div class="changeType">
                    <a href="login_staff.jsp">
                        <p>切换为员工登录</p>
                    </a>
                </div>
            </form>
        </section>
    </section>
</body>
</html>
