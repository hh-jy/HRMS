<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/staffHead.jsp" %>

<div class="right">
    <div class="wrap admin-wrap">
            <br>
            <div class="subtitle">
                <span>个人工作信息</span>
            </div>
            <%--        table标签开始--%>
            <table cellspacing="0" cellpadding="0" class="infotable">
                <tbody>
                <%--每个td标签里面&nbsp;后记得加 参数${}--%>
                <tr>
                    <th align="right" width="10%">员工编号:</th>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <th align="right">入职日期:</th>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <th align="right">岗位职务:</th>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <th align="right">在职状态:</th>
                    <td>&nbsp;</td>
                </tr>
                </tbody>
            </table>
            <%--        table结束--%>
    </div>
</div>

<%@include file="/jsp/common/foot.jsp" %>
