<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<section>
 <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>员工登录管理页面 >> 查看员工登录信息页面</span>
        </div>
        <div class="providerView">
            <p><strong>员工编号：</strong><span></span></p>
            <p><strong>姓名：</strong><span></span></p>
            <p><strong>密码：</strong><span></span></p>
            <p><strong>类别：</strong><span></span></p>
			<div class="providerAddBtn">
            	<input type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userview.js"></script>