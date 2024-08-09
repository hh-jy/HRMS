<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>奖惩管理页面 >> 修改奖惩内容页面</span>
    </div>
    <div class="providerAdd">
        <%--修改奖惩表单开始--%>
        <form id="rewardForm" name="rewardForm" method="get" action="">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="uid" value=""/>

            <div>
                <label>序号：</label>
                <input type="text" name="id" id="id" value="">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label>员工编号：</label>
                <input type="text" name="userCode" id="userCode" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>部门：</label>
                <input type="text" name="departmentCode" id="departmentCode" value="">
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
            </div>
            <div>
                <label>奖惩金额：</label>
                <input type="text" name="money" id="money" value="">
                <font color="red"></font>
            </div>
            <div class="providerAddBtn">
                <input type="button" name="save" id="save" value="保存"/>
                <input type="button" id="back" name="back" value="返回"/>
            </div>
        </form>
<%--修改奖惩表单结束--%>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/usermodify.js"></script>
