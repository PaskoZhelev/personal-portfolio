
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

			<!--<c:url var="redirectUpdate" value="/home-update" />
			<form action="<c:out value="${redirectUpdate}"/>" method="post">
				<p class="text-center">
					<button type="submit" class="btn btn-success">Update</button>
				</p>
			</form>-->
			
			<p style="padding-top: 15px; padding-left: 20px"><a href="/home-update" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Update</a></p>
		</div>
	</div>

</div>
<!-- /.container -->

<%@ include file="./common/footer.jsp"%>
