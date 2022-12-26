<%--
  Created by IntelliJ IDEA.
  User: 11937
  Date: 2022/12/26
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Registration Form</title>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
            font-size: 14px;
        }
        label {
            display: block;
            margin-bottom: 8px;
        }
        input[type="text"], input[type="password"], input[type="email"] {
            width: 100%;
            padding: 12px 20px;
            margin-bottom: 20px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
            width: 50%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Registration Form</h1>
    <form action="/doRegister" method="post">
        <label for="account">Username:</label>
        <input type="text" id="account" name="account" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>