<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>公司部门管理页面 >> 修改公司部门信息页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="/jsp/user.do">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="uid"/>
            <div>
                <label>部门编号：</label>
                <input type="text" name="departmentCode" id="departmentCode" value="">
                <font color="red"></font>
            </div>

            <div>
                <label>部门名称：</label>
                <input type="text" name="departmentName" id="departmentName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>部门负责人员工：</label>
                <input type="text" name="departmentLeader" id="departmentLeader" value="">
            </div>
            <div>
                <label>上级部门：</label>
                <input type="text" name="superiorDepartment" id="superiorDepartment" value="">
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
