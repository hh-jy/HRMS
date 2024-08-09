<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/staffHead.jsp" %>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>员工基本信息页面</span>
    </div>
    <form name="staffBaseInfo" method="post">
        <div class="subtitle">
            <%--span标签里加个userName--%>
            <span>   员工</span>
        </div>
<%--        table标签开始--%>
        <table cellspacing="0" cellpadding="0" class="infotable">
            <tbody>
<%--每个td标签里面&nbsp;后记得加 参数${}--%>
            <tr>
                <th align="right" width="10%">员工编号:</th>
                <td>&nbsp;</td>
                <th align="right" width="10%">姓名:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">性别:</th>
                <td>&nbsp;</td>
                <th align="right">出生日期:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">民族:</th>
                <td>&nbsp;</td>
                <th align="right">政治面貌:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">手机号:</th>
                <td>&nbsp;</td>
                <th align="right">邮箱:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">身份证号:</th>
                <td>&nbsp;</td>
                <th align="right">籍贯:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">文化程度:</th>
                <td>&nbsp;</td>
                <th align="right">婚姻情况:</th>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <th align="right">户口所在地:</th>
                <td colspan="3">&nbsp;</td>
            </tr>
            <tr>
                <th align="right">证件照:</th>
                <td colspan="3">&nbsp;</td>
            </tr>
            </tbody>
        </table>
<%--        table结束--%>
        <br>
        <div class="buttonc">
<%--修改基本信息的jsp：astaff_ModifyBaseInfo.jsp--%>
            <input type="button" value="修 改" class="button" onclick="">
        </div>
    </form>
</div>

<%@include file="/jsp/common/foot.jsp" %>
