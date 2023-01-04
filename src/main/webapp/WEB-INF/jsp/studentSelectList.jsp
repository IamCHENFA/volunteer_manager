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
        <li>
          <a href="/helloStudent" >可选活动</a>
        </li>
        <li class="active">
          <a href="#">我的活动</a>
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
          <th>老师</th>
          <th>分数</th>>
          <th>操作</th>
        </tr>
        </thead>
        <%--                从list中遍历--%>
        <tbody>
        <c:forEach var="actScInfo" items="${actScInfoList}">
          <tr>
            <td>${actScInfo.vid}</td>
            <td>${actScInfo.VName}</td>
            <td>${actScInfo.TAccount}</td>
            <td>${actScInfo.score}</td>
            <td><a href="isDelete?vid=${actScInfo.vid}" onclick="return(confirm('确认删除?'))">删除</a>></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>

</body>
</html>