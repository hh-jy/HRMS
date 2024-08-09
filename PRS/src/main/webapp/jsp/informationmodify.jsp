<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>基本信息管理页面 >> 修改员工基本信息页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="">
            <input type="hidden" name="method" value="modifyexe">
            <%--value要写参数--%>
            <input type="hidden" name="uid" value=""/>
            <div>
                <label>员工编号：</label>
                <%--value要写参数--%>
                <input type="text" name="userCode" id="userCode" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>员工姓名：</label>
                <%--value要写参数--%>
                <input type="text" name="userName" id="userName" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>性别：</label>
                <select name="gender" id="gender">
                    <c:choose>
                        <c:when test="${user.gender == 1 }">
                            <option value="1" selected="selected">男</option>
                            <option value="2">女</option>
                        </c:when>
                        <c:otherwise>
                            <option value="1">男</option>
                            <option value="2" selected="selected">女</option>
                        </c:otherwise>
                    </c:choose>
                </select>
            </div>
            <div>
                <label>民族：</label>
                <%--value要写参数--%>
                <input type="text" name="nationality" id="nationality" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>出生日期：</label>
                <%--value要写参数--%>
                <input type="text" Class="Wdate" id="birthday" name="birthday" value=""
                       readonly="readonly" onclick="WdatePicker();">
                <font color="red"></font>
            </div>
            <div>
                <label>政治面貌：</label>
                <%--value要写参数--%>
                <input type="text" name="userPassword" id="userPassword" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>文化程度：</label>
                <input type="text" name="educationLevel" id="educationLevel" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>婚姻情况：</label>
                <input type="text" name="maritalStatus" id="maritalStatus" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>身份证号：</label>
                <input type="text" name="IDnumber" id="IDnumber" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>手机号：</label>
                <input type="text" name="phoneNumber" id="phoneNumber" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>邮箱：</label>
                <input type="text" name="email" id="email" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>籍贯：</label>
                <input type="text" name="native" id="native" value="">
            </div>
            <div>
                <label>户口所在地：</label>
                <!-- 列出所有的角色分类 -->
                <input type="text" name="residence" id="residence" value="">
                <font color="red"></font>
            </div>
            <div class="providerAddBtn">
                <input type="button" name="save" id="save" value="保存"/>
                <input type="button" id="back" name="back" value="返回"/>
            </div>
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/usermodify.js"></script>
