<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>员工登录管理页面 >> 修改员工登录信息页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post">
            <input type="hidden" name="method" value="modifyexe">
            <%--value要写参数--%>
            <input type="hidden" name="uid" value=" "/>
            <div>
                <label>员工编号：</label>
                <%--value要写参数--%>
                <input type="text" name="userCode" id="userCode" value="">
                <font color="red"></font>
            </div>

            <div>
                <label>姓名：</label>
                <input type="text" name="userName" id="userName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>密码：</label>
                <input type="text" name="userPassword" id="userPassword" value="">
            </div>
            <div>
                <label>类别：</label>
                <input type="text" name="type" id="type" value="">
            </div>
            <div class="providerAddBtn">
                <input type="button" name="save" id="save" value="保存"/>
                <input type="button" id="back" name="back" value="返回"/>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/usermodify.js"></script>
