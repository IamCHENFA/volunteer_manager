<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改客户信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改活动信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/doUpdateAct" method="post">
        <div class="form-group">
            <label>活动编号</label>
            <input type="number" class="form-control" name="vid" value="${activity.vid}" readonly>
        </div>
        <div class="form-group">
            <label>负责老师</label>
            <input type="text" class="form-control" name="managementTeacherAccount" value="${activity.managementTeacherAccount}" readonly>
        </div>
        <div class="form-group">
            <label>活动名称</label>
            <input type="text" class="form-control" name="vName" value="${activity.VName}" required>
        </div>
        <div class="form-group">
            <label>活动信息</label>
            <input type="text" class="form-control" name="VInfo" value="${activity.VInfo}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>
