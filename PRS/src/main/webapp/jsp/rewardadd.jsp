<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>奖惩管理页面 >> 添加奖惩内容页面</span>
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
                <label>部门：</label>
                <input type="text" name="departmentCode" id="departmentCode" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label>奖惩时间：</label>
                <input type="text" name="rewardTime" id="rewardTime" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>奖惩原因：</label>
                <input type="text" name="rewardReason" id="rewardReason" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>奖惩金额：</label>
                <input type="text" name="money" id="money" value="">
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
