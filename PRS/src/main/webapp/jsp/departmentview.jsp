<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<section>
 <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>公司部门管理页面 >> 查看公司部门信息页面</span>
        </div>
        <div class="providerView">
            <p><strong>部门编号：</strong><span></span></p>
            <p><strong>部门名称：</strong><span></span></p>
            <p><strong>部门负责人员工：</strong><span></span></p>
            <p><strong>上级部门：</strong><span></span></p>
			<div class="providerAddBtn">
            	<input type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userview.js"></script>