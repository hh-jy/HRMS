<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/staffHead.jsp" %>

<div class="right">
    <br>
    <div class="subtitle">
        <span>员工岗位调动信息</span>
    </div>
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <th width="5%">序号</th>
            <th width="10%">员工编号</th>
            <th width="10%">调出部门</th>
            <th width="10%">调入部门</th>
            <th width="15%">调动原因</th>
            <th width="10%">调动日期</th>
        </tr>
        <%-- <c:forEach var="user" items="${userList }" varStatus="status">
            <tr>
                <td>
                    <span>${user.userCode }</span>
                </td>
                <td>
                    <span>${user.userName }</span>
                </td>
                <td>
                    <span> </span>
                </td>
                <td>
                    <span>${user.age}</span>
                </td>
                <td>
                    <span>${user.phone}</span>
                </td>
                <td>
                    <span>${user.userRoleName}</span>
                </td>
            </tr>
        </c:forEach> --%>
    </table>
</div>

<%@include file="/jsp/common/foot.jsp" %>
