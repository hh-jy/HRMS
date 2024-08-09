<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/staffHead.jsp" %>
<div class="right">

    <div class="wrap admin-wrap">
        <form name="staffBaseInfo" method="post">
            <div class="subtitle">
                <br>
                <span>修改员工基本信息</span>
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
                    <th align="right" >手机号:</th>
                    <td style="padding: 6px 20px">
                        <%--value值中是要修改的新手机号--%>
                            <input type="text" name="IPT_PHONE" id="phone" size="20">
<%--                            <span class="needstar"> </span>--%>
<%--                            <span class="explain">(区号-电话号码)</span>--%>
                    </td>
                    <th align="right">身份证号:</th>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <th align="right">邮箱:</th>
                    <td style="padding: 6px 20px">
                        <%--value值中是要修改的新邮箱--%>
                        <input type="text" name="IPT_EMAIL" id="email" size="30" value="   ">
<%--                        <span class="needstar">*</span>--%>
                    </td>
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
                <input name="Button" type="button" class="button" value="提 交" onclick="">
                <input type="Button" class="button" value="取 消" onclick="">
            </div>
        </form>
    </div>
</div>
<%@include file="/jsp/common/foot.jsp" %>
