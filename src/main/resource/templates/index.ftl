<#import "nav.ftl" as nav>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>导航页</title>
    <!-- 引入 Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../bootstrap/js/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<@nav.nav false/>
	<div class="container" style="margin-top:50px;">
		<a href="/operate/signUp" target="_blank" class="btn btn-default btn-lg  btn-block" style="margin-top:50px;">注&nbsp;&nbsp;&nbsp;册</a>
		<a href="/login" target="_blank" class="btn btn-info btn-lg  btn-block" style="margin-top:50px;">上&nbsp;&nbsp;&nbsp;线</a>      
	</div>
</body>
</html>