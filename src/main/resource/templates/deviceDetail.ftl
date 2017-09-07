<#import "nav.ftl" as nav>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>登录</title>
    <!-- 引入 Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../bootstrap/js/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<@nav.nav true/>
	<form class="form-horizontal" role="form" method="POST" action="/operate/getData">
        <div class="para" label-module="para">
			设备名称：${deviceName}
		</div>
        <div class="para" label-module="para">
			设备类型：${typeCode}
		</div>
        <div class="para" label-module="para">
			生产商：${manufacturer}
		</div>
        <div class="para" label-module="para">
			设备描述：${description}
		</div>
        <div class="para" label-module="para">
			图片展示：
			<img src="${picUrl}" width=120 height=120>
		</div>
        <div class="para" label-module="para">
			应用领域：${domain}
		</div>
       <input type="hidden" name="deviceName" value="${deviceName}">
       <div class="form-group">
            <label for="targetDevice" class="col-sm-2 control-label">获取数据节点名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="targetDevice" placeholder="请输入想要获取数据的节点名称" name="targetDevice">
            </div>
        </div>
        	资源等级：
        <div class="container">
		  <div class="dropdown">
		    <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">资源等级
		    <span class="caret"></span></button>
		    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
		      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">标清</a></li>
		      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">高清</a></li>
		      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">超清</a></li>
		    </ul>
		  </div>
		</div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">获取信息</button>
            </div>
        </div>
    </form>
</body>
</html>