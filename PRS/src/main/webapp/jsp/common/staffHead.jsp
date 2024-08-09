<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>员工人事档案管理系统</title>
    <link type="text/css" rel="stylesheet" href="../css/style.css"/>
    <link type="text/css" rel="stylesheet" href="../css/staff_public.css"/>
    <link type="text/css" rel="stylesheet" href="../css/astaff_BaseInfo.css"/>
</head>
<body>


<!--头部-->
<header class="publicHeader">
    <h1>员工人事档案管理系统</h1>
    <div class="publicHeaderR">
        <p><span>欢迎登录！</span><span style="color: #fff21b"> </span></p>
        <%--            <a href="../jsp/logout.do">退出登录</a>--%>
        <a href="http://localhost:8080/PRS/login_staff.jsp">退出登录</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="../jsp/astaff_BaseInfo.jsp">基本信息</a></li>
                <li><a href="../jsp/astaff_WorkInfo.jsp">工作信息</a></li>
                <li><a href="../jsp/astaff_RewardInfo.jsp">奖惩信息</a></li>
                <li><a href="../jsp/astaff_TransferInfo.jsp">调动管理</a></li>
                <li><a href="../jsp/astaff_SalaryInfo.jsp">薪资明细</a></li>
                <li><a href="../jsp/astaff_ModifyPwd.jsp">修改密码</a></li>
            </ul>
        </nav>
    </div>

    <%--     <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>--%>
<%--     <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>--%>