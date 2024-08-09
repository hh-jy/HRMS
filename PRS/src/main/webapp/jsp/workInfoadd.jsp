<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<section>
<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>工作信息管理页面 >> 添加员工工作信息页面</span>
        </div>
        <div class="providerAdd">
            <form id="userForm" name="userForm" method="post">
				<input type="hidden" name="method" value="add">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                    <label>员工编号：</label>
                    <input type="text" name="userCode" id="userCode" value=""> 
					<!-- 放置提示信息 -->
					<font color="red"></font>
                </div>
                <div>
                    <label>入职日期：</label>
                    <input type="text" name="inDate" id="inDate" value="">
					<font color="red"></font>
                </div>
                <div>
                    <label>员工状态：</label>
                    <input type="password" name="status" id="status" value="">
					<font color="red"></font>
                </div>
                <div>
                    <label>岗位职务：</label>
                    <input type="password" name="occupy" id="occupy" value="">
					<font color="red"></font>
                </div>
                <div class="providerAddBtn">
                    <input type="button" name="add" id="add" value="保存" >
					<input type="button" id="back" name="back" value="返回" >
                </div>
            </form>
        </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/useradd.js"></script>
