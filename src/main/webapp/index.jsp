<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>µÇÂ¼</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <h3 class="text-center">µÇÂ¼</h3>
            <form action="/login" method="post">
                <div class="form-group">
                    <label for="username">ÓÃ»§Ãû</label>
                    <input type="text" class="form-control" id="username" name="username">
                </div>
                <div class="form-group">
                    <label for="password">ÃÜÂë</label>
                    <input type="password" class="form-control" id="password" name="password">
                </div>
                <button type="submit" class="btn btn-primary btn-block">µÇÂ¼</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>