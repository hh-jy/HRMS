<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>离职管理页面 >> 修改员工离职信息页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="uid" value=""/>
            <div>
                <label>员工编号：</label>
                <input type="text" name="userCode" id="userCode" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>部门：</label>
                <input type="text" name="department" id="department" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>离职原因：</label>
                <input type="text" name="dimissReason" id="dimissReason" value="">
            </div>
            <div>
                <label>离职时间：</label>
                <input type="text" name="dimissTime" id="dimissTime" value="">
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
