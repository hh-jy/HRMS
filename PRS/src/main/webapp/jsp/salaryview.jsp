<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<section>
 <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>薪资明细管理页面 >> 查看员工薪资明细页面</span>
        </div>
        <div class="providerView">
            <p><strong>员工编号：</strong><span></span></p>
            <p><strong>基本工资：</strong><span></span></p>
            <p><strong>奖励金额：</strong><span></span></p>
            <p><strong>惩罚金额：</strong><span></span></p>
            <p><strong>工资薪资所得：</strong><span></span></p>
			<div class="providerAddBtn">
            	<input type="button" id="back" name="back" value="返回" >
            </div>
        </div>
    </div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userview.js"></script>