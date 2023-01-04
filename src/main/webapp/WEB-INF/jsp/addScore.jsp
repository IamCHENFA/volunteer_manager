<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>打分</title>
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
                <li>
                    <a href="/teacherAct" >我管理的活动</a>
                </li>
                <li class="active">
                    <a href="#" >打分</a>
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
                    <th>学生</th>
                    <th>分数</th>
                    <th>打分</th>
                </tr>
                </thead>
                <%--                从list中遍历--%>
                <tbody>
                <c:forEach var="act" items="${actScInfoList}">
                    <tr>
                        <td>${act.vid}</td>
                        <td>${act.VName}</td>
                        <td>${act.TAccount}</td>
                        <td>${act.score}</td>
                        <td>
                            <form action="/doAddScore" method="post">
                                <input type="number" min="0" max="100" name="score" id="score" value="${act.score}">
                                <input type="text" name="account" id="account" value="${act.TAccount}" hidden>
                                <input type="number" name="vid" id="vid" value="${act.vid}" hidden>
                                <div class="btn-group">
                                    <button type="submit" value="打分" class="btn btn-default btn-block"></button>
                                </div>
                            </form>
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