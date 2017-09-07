<!DOCTYPE html>
<html>

<head>
    <title>设备详情显示</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1"/>
    <meta name="renderer" content="webkit">
    <meta name="keywords" content="设备详情"/>
    <meta name="description" content="设备详情"/>
    <link rel="shortcut icon" href="/img/favicon.ico" type="image/x-icon">
    <link rel="icon" href="/img/favicon.ico" type="image/x-icon">
    <link href="/css/reset.css" type="text/css" rel="stylesheet"/>
   	<link href="/css/credit-home-v2.css" type="text/css" rel="stylesheet" />
   	<link href="/css/device-detail.css" type="text/css" rel="stylesheet"/>
</head>

<body>
	<div class="box">
	   <@content.content creditCardDiscount related.result![] relatedCard.result![] recommendList![]/>
	   <#-- <@content.content creditCardDiscount related.result![] related.result![]/> -->
	</div>

</body>
</html>	