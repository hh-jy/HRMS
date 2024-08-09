<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/staffHead.jsp" %>

<div class="right">
    <br>
    <div class="subtitle">
        <span>员工奖惩信息</span>
    </div>
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <th width="5%">序号</th>
            <th width="10%">员工编号</th>
            <th width="10%">所在部门</th>
            <th width="10%">奖惩金额</th>
            <th width="15%">奖惩原因</th>
            <th width="10%">奖惩时间</th>
        </tr><%-- 
		<c:forEach>
			<tr>
				<td><span> </span></td>
				<td><span> </span></td>
				<td><span> </span></td>
				<td><span> </span></td>
				<td><span> </span></td>
				<td><span> </span></td>
			</tr>
		</c:forEach>
	 --%></table>
</div>

<%@include file="/jsp/common/foot.jsp" %>