<#macro nav flag>
<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">安全平台</a>
    </div>
    <#if flag>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="/operate/logout"><span class="glyphicon glyphicon-log-in"></span> 下&nbsp;线</a></li>
	    </ul>
	</#if>
  </div>
</nav>
</#macro>