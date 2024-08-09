<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>基本信息管理页面 >> 添加员工基本信息页面</span>
    </div>
    <div class="providerAdd">

        <form id="userForm" name="userForm" method="post">
            <input type="hidden" name="method" value="add">
            <!--div的class 为error是验证错误，ok是验证成功-->

            <div>
                <label>员工编号：</label>
                <input type="text" name="userCode" id="userCode" value=" ">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label>员工姓名：</label>
                <input type="text" name="userName" id="userName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>用户性别：</label>
                <select name="gender" id="gender">
                    <option value="1" selected="selected">男</option>
                    <option value="2">女</option>
                </select>
            </div>
            <div>
                <label>民族：</label>
                <input type="text" name="nationality" id="nationality" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>出生日期：</label>
                <input type="text" Class="Wdate" id="birthday" name="birthday"
                       readonly="readonly" onclick="WdatePicker();">
                <font color="red"></font>
            </div>
            <div>
                <label>政治面貌：</label>
                <input type="password" name="politicalStatus" id="politicalStatus" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>文化程度：</label>
                <input type="password" name="educationLevel" id="educationLevel" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>婚姻情况：</label>
                <input type="password" name="maritalStatus" id="maritalStatus," value="">
                <font color="red"></font>
            </div>
            <div>
                <label>身份证号：</label>
                <input type="password" name="IDnumber" id="IDnumber" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>手机号：</label>
                <input type="password" name="phoneNumber" id="phoneNumber" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>邮箱：</label>
                <input type="password" name="email" id="email" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>籍贯：</label>
                <input type="password" name="native" id="native" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>户口所在地：</label>
                <input type="password" name="residence" id="residence" value="">
                <font color="red"></font>
            </div>

            <div class="providerAddBtn">
                <input type="button" name="add" id="add" value="保存">
                <input type="button" id="back" name="back" value="返回">
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/useradd.js"></script>
