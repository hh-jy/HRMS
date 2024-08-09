<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>基本信息管理页面 >> 查看员工基本信息页面</span>
    </div>

    <div class="providerView">
        <p><strong>员工编号：</strong><span></span></p>
        <p><strong>员工姓名：</strong><span></span></p>
        <p><strong>性别：</strong>
            <span>
            		<c:if test="${user.gender == 1 }">男</c:if>
					<c:if test="${user.gender == 2 }">女</c:if>
			</span>
        </p>
        <p><strong>民族：</strong><span></span></p>
        <p><strong>出生日期：</strong><span></span></p>
        <p><strong>政治面貌：</strong><span></span></p>
        <p><strong>文化程度：</strong><span></span></p>
        <p><strong>婚姻情况：</strong><span></span></p>
        <p><strong>身份证号：</strong><span></span></p>
        <p><strong>手机号：</strong><span></span></p>
        <p><strong>邮箱：</strong><span></span></p>
        <p><strong>籍贯：</strong><span></span></p>
        <p><strong>户口所在地：</strong><span></span></p>
        <div class="providerAddBtn">
            <input type="button" id="back" name="back" value="返回">
        </div>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userview.js"></script>