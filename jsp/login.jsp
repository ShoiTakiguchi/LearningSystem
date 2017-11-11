<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<HTML>
<%@ include file="./common.jsp"%>
<link rel="stylesheet" type="text/css" href="../css/login.css">
<link rel="stylesheet" type="text/js" href="../js/login.js">
<BODY>
	<div class="container">

		<div class="row" style="margin-top: 20px">
			<div
				class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<form role="form" action="./LoginServlet" method="post">
					<fieldset>
						<h2>Please Sign In</h2>
						<hr class="colorgraph">
						<div class="form-group">
							<input type="text" name="user_id" id="email"
								class="form-control input-lg" placeholder="User ID">
						</div>
						<div class="form-group">
							<input type="password" name="user_password" id="password"
								class="form-control input-lg" placeholder="Password">
						</div>

						<span class="button-checkbox"></span>

						<hr class="colorgraph">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
								<input type="submit" class="btn btn-lg btn-success btn-block"
									value="Sign In">
							</div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<a href="./SignUp.jsp" class="btn btn-lg btn-primary btn-block">Sign
									up</a>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</BODY>
</HTML>