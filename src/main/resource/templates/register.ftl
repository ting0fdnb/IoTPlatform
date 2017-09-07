<#import "nav.ftl" as nav>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>注册</title>
    <!-- 引入 Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../bootstrap/js/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<@nav.nav true/>
<div class="container">
    <form class="form-horizontal" role="form" method="POST" action="/operate/signUp">
        <div class="form-group">
            <label for="devicename" class="col-sm-2 control-label">设备名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="deviceName" placeholder="请输入设备名称" name="deviceName">
            </div>
        </div>
        <div class="form-group">
            <label for="typecode" class="col-sm-2 control-label">设备类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="typeCode" placeholder="请输入设备类型" name="typeCode">
            </div>
        </div>
        <div class="form-group">
            <label for="manufacturer" class="col-sm-2 control-label">生产商</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="manufacturer" placeholder="请输入生产商" name="manufacturer">
            </div>
        </div>
        <div class="form-group">
            <label for="deviceCode" class="col-sm-2 control-label">设备码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="deviceCode" placeholder="请输入设备码" name="deviceCode">
            </div>
        </div>
        <div class="form-group">
            <label for="description" class="col-sm-2 control-label">设备描述</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="description" placeholder="请输入设备描述" name="description">
            </div>
        </div>
        <div class="form-group">
            <label for="picUrl" class="col-sm-2 control-label">图片链接</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="picUrl" placeholder="请输入图片链接地址" name="picUrl">
            </div>
        </div>
        <div class="form-group">
            <label for="domain" class="col-sm-2 control-label">设备应用领域</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="domain" placeholder="请输入设备应用领域" name="domain">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">设备注册</button>
            </div>
        </div>
    </form>

</div>

</body>
</html>
