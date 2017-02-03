
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Theme Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="/resources/assets/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="/resources/assets/css/bootstrap-theme.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/assets/css/theme.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../resources/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="/resources/assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<!-- Fixed navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Bootstrap theme</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Beni Ara YiÄidim</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Theme example</h1>
			<p>Yemeeekkkk:</p>
		</div>



		<div class="page-header">
			<h1>
				Tables
				<button type="button" data-toggle="modal" data-target="#elifsmodal"
					style="float: right;" class="btn btn-lg btn-success">Yeni
					Kayıt Ekle</button>
			</h1>
		</div>
		<div class="row">

			<div class="col-md-12">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Adı</th>
							<th>Fiyatı</th>
							<th>Tarihi</th>
							<th>Sil</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${actions}" var="action">
							<tr>
								<td>${action.id}</td>
								<td>${action.person.name}</td>
								<td>${action.price}</td>
								<td><fmt:formatDate value="${action.eatDate2}" pattern="yyyy-MM-dd"/></td>
								<td><a href="/${action.id}/delete" class="btn btn-danger">Sil</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>




		<!-- Modal -->
		<div id="elifsmodal" class="modal fade" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Yemek Kayıtı</h4>
					</div>

					<form:form method="POST" action="/"  modelAttribute="action">

						<div class="modal-body">
							<div class="form-group">
								<label for="sel1">Kişi:</label>
									
							<form:select multiple="false" path="person.id"
								class="form-control">
								<form:options items="${prsn}" itemValue="id"
									itemLabel="name" />
							</form:select>
									
									
							</div>
							<div class="form-group">
								<label for="usr">Yemek Fiyatı:</label> <form:input path="price" type="number" class="form-control"
								placeholder="Fiyat" />
							</div>
							<div class="form-group">
								<label for="usr">Yemek Tarihi:</label> <form:input path="eatDate" type="date" class="form-control"
								placeholder="Tarih" />
							</div>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-default">Kaydet</button>
						</div>
					</form:form>
				</div>

			</div>
		</div>



	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="/resources/assets/js/bootstrap.min.js"></script>
	<script src="/resources/assets/js/docs.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="/resources/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
