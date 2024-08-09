<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/stastic/bootstrap-3.4.1-dist/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<script
	src="${APP_PATH}/stastic/bootstrap-3.4.1-dist/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>
<section>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>奖惩管理页面</span>
            </div>
            <div class="search">
           		<form method="get">
					<input name="method" value="query" class="input-text" type="hidden">
					 <span>员工编号：</span>
					 <input name="userCode" class="input-text"	type="text" value=" ">
					 
					 <span>奖惩原因：</span>
					<input name="rewardReason" class="input-text"	type="text" value=" ">
					 
					 <input type="hidden" name="pageIndex" value="1"/>
					 <input	value="查 询" type="submit" id="searchbutton">
					 <a href="rewardadd.jsp" >添加奖惩信息</a>
				</form>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="7%">序号</th>
                    <th width="13%">员工编号</th>
                    <th width="10%">部门</th>
                    <th width="10%">奖惩时间</th>
                    <th width="10%">奖惩原因</th>
                    <th width="10%">奖惩金额</th>
                    <th width="30%">操作</th>
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
							<span>
								<c:if test="${user.gender==1}">男</c:if>
								<c:if test="${user.gender==2}">女</c:if>
							</span>
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
						<td>
						<span><a class="viewUser" href="javascript:;" userid=${user.id } username=${user.userName }><img src="${pageContext.request.contextPath }/images/read.png" alt="查看" title="查看"/></a></span>
						<span><a class="modifyUser" href="javascript:;" userid=${user.id } username=${user.userName }><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/></a></span>
						<span><a class="deleteUser" href="javascript:;" userid=${user.id } username=${user.userName }><img src="${pageContext.request.contextPath }/images/schu.png" alt="删除" title="删除"/></a></span>
						</td>
					</tr>
				</c:forEach> --%>
			</table>
			<input type="hidden" id="totalPageCount" value=""/>
		  	<c:import url="rollpage.jsp">
	          	<c:param name="totalCount" value=""/>
	          	<c:param name="currentPageNo" value=""/>
	          	<c:param name="totalPageCount" value=""/>
          	</c:import>
        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/js/userlist.js"></script>
