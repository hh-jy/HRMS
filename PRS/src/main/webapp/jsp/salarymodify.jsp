<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<section>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>薪资明细管理页面 >> 修改员工薪资明细页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post">
            <input type="hidden" name="method" value="modifyexe">
            <input type="hidden" name="uid" value=""/>
            <div>
                <label>员工编号：</label>
                <input type="text" name="userCode" id="userCode" value="">
                <font color="red"></font>
            </div>
            <div>
                <label>基本工资：</label>
                <input type="text" name="baseSalary" id="baseSalary">
                <font color="red"></font>
            </div>
            <div>
                <label>奖励金额：</label>
                <input type="text" name="reward" id="reward" value="">
            </div>
            <div>
                <label>惩罚金额：</label>
                <input type="text" name="penalties" id="penalties" value="">
            </div>
            <div>
                <label>工资薪资所得：</label>
                <input type="text" name="totalSalary" id="totalSalary" value="">
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
