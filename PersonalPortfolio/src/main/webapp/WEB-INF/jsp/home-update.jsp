
<%@ include file="./common/header.jsp"%>
<%@ include file="./common/navigation.jsp"%>
<!-- Page Content -->
<div class="container">

	<p><h3>Update Home Page</h3></p><br/><br/>
		<form:form commandName="homeForm" method="post">
			<p>Update Personal Information</p>
             <table style="width:100px; border-spacing:0;">
               <tr>
                 <td><form:textarea path="personalInfo" rows="5" cols="80" /></td>
               </tr>
               <tr >
                  <td><span style="color: red" class="errorblock"><form:errors path="personalInfo"/></span></td>
               </tr>
             </table>
             
             <p>Update Biography</p>
             <table style="width:100px; border-spacing:0;">
               <tr>
                 <td><form:textarea path="bio" rows="8" cols="80" /></td>
               </tr>
               <tr >
                  <td><span style="color: red" class="errorblock"><form:errors path="bio"/></span></td>
               </tr>
             </table>
             
             <p>Update Academic Information</p>
             <table style="width:100px; border-spacing:0;">
               <tr>
                 <td><form:textarea path="academicInfo" rows="5" cols="80" /></td>
               </tr>
               <tr >
                  <td><span style="color: red" class="errorblock"><form:errors path="academicInfo"/></span></td>
               </tr>
             </table>
             
             <p style="padding-top: 15px; padding-left: 20px"><button class="btn btn-success" type="submit">Update Home</button></p>
		</form:form>


</div>
<!-- /.container -->

<%@ include file="./common/footer.jsp"%>
