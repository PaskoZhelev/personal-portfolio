
<%@ include file="./common/header.jsp"%>
<%@ include file="./common/navigation.jsp"%>
<!-- Page Content -->
<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<img src="images/sample-man.jpg" class="img-fluid" alt="Sample Man">
		</div>
		<div class="col-sm-8">
			<h1 class="mt-5">${ personalInfo }</h1>
			<p>${ bio }</p>
			<p>${ academicInfo }</p>
			<p class="text-center">
				<button type="button" class="btn btn-success">Update</button>
			</p>
		</div>
	</div>

</div>
<!-- /.container -->

<%@ include file="./common/footer.jsp"%>
