<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2022/5/17
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
    <title>Title</title>
    <script>
        const APP_PATH = "${APP_PATH }";
    </script>
    <script src="${APP_PATH }/static/jQuery/jquery-3.1.1.min.js"></script>
    <script src="${APP_PATH }/static/bootstrap-5.1.1-dist/js/bootstrap.js"></script>
    <link href="${APP_PATH }/static/bootstrap-5.1.1-dist/css/bootstrap.css" rel="stylesheet">
    <script src="${APP_PATH }/static/js/book.js"></script>
</head>

<body>
<p>${APP_PATH }</p>
<button type="button" id="fix">aaa</button>
</body>
</html>