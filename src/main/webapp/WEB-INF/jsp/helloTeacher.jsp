<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>教师</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3>Hello，老师</h3>
            <ul class="nav nav-tabs">
                <li class="active">
                    <a href="#" >我管理的活动</a>
                </li>
                <li>
                    <a href="/addScore" >打分</a>
                </li>
                <li>
                    <a href="/addNewActivity">发布新活动</a>
                </li>
                <li class="dropdown pull-right">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="index.jsp">退出登录</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <table class="table">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>活动名</th>
                    <th>活动介绍</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--                从list中遍历--%>
                <tbody>
                <c:forEach var="voluntaryActivity" items="${activityListT}">
                    <tr>
                        <td>${voluntaryActivity.vid}</td>
                        <td>${voluntaryActivity.VName}</td>
                        <td>${voluntaryActivity.VInfo}</td>
                        <td>
                            <a href="updateAct?vid=${voluntaryActivity.vid}">编辑</a>>
                             |
                            <a href="isDeleteAct?vid=${voluntaryActivity.vid}&t=${voluntaryActivity.managementTeacherAccount}" onclick="return(confirm('确认删除活动?'))">删除</a>>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>