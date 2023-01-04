<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>学生</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3>Hello，学生</h3>
            <ul class="nav nav-tabs">
                <li class="active">
                    <a href="#" >可选活动</a>
                </li>
                <li>
                    <a href="/studentSelectList">我的活动</a>
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
                    <th>老师</th>
                    <th>操作</th>
                </tr>
                </thead>
<%--                从list中遍历--%>
                <tbody>
                <c:forEach var="voluntaryActivity" items="${activityList}">
                    <tr>
                        <td>${voluntaryActivity.vid}</td>
                        <td>${voluntaryActivity.VName}</td>
                        <td>${voluntaryActivity.VInfo}</td>
                        <td>${voluntaryActivity.managementTeacherAccount}</td>
                        <td><a href="isSelect?vid=${voluntaryActivity.vid}" onclick="return(confirm('确认选择?'))">选择</a>></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>