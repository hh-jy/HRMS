<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<section>
 <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>奖惩管理页面 >> 查看奖惩内容页面</span>
        </div>
        <div class="providerView">
            <p><strong>序号：</strong><span> </span></p>
            <p><strong>员工编号：</strong><span> </span></p>
            <p><strong>部门：</strong><span> </span></p>
            <p><strong>奖惩时间：</strong><span> </span></p>
            <p><strong>奖惩原因：</strong><span> </span></p>
            <p><strong>奖惩金额：</strong><span> </span></p>
			<div class="providerAddBtn">
            	<input type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userview.js"></script>