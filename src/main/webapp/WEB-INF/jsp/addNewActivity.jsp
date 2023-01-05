<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <title>添加新的活动</title>
  <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>新增志愿活动</small>
        </h1>
      </div>
    </div>
  </div>

  <form action="/doAddNewActivity" method="post">
    <div class="form-group">
      <label>活动名称</label>
      <label style="color: red">*</label>
      <input type="text" class="form-control" name="vName" required>
    </div>

    <div class="form-group">
      <label>活动介绍</label>
      <label style="color: red">*</label>
      <input type="text" class="form-control" name="vInfo" required>
    </div>
    <div class="form-group">
      <input type="submit" class="form-control" value="添加">
    </div>
  </form>

</div>
</body>
</html>
