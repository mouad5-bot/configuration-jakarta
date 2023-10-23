
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
  <%@include file="/include/_head.jsp" %>
  <title>Register</title>
</head>
<body>

<%@include file="/include/_nav.jsp" %>


<div class="container container-auth" id="login">
  <div class="row">
    <div class="col-md-6 d-flex justify-content-center align-items-center" id="logo-auth">
      <img src="assets/images/logo.png" alt="register">
    </div>
    <div class="col-md-5">
      <div class="card border border-black border-2" id="auth-text">
        <div class="h1 m-auto mt-3 mb-2 title">Register
          <hr class="borderOfLineOfLogin">
        </div>
        <div class="card-body">
          <form method="POST" action="register.py">
            <div class="row mb-3">
              <label for="fname" class="col-md-4 col-form-label text-md-end">First Name</label>

              <div class="col-md-8">
                <input id="fname" type="text" class="form-control" name="fname" value="" required autocomplete="fname" autofocus>
              </div>
            </div>
            <div class="row mb-3">
              <label for="lname" class="col-md-4 col-form-label text-md-end">Last Name</label>

              <div class="col-md-8">
                <input id="lname" type="text" class="form-control" name="lname" value="" required autocomplete="lname" autofocus>
              </div>
            </div>

            <div class="row mb-3">
              <label for="email" class="col-md-4 col-form-label text-md-end">Email Address</label>

              <div class="col-md-8">
                <input id="email" type="email" class="form-control" name="email" value="" required autocomplete="email">

              </div>
            </div>

            <div class="row mb-3">
              <label for="password" class="col-md-4 col-form-label text-md-end">Password</label>

              <div class="col-md-8">
                <input id="password" type="password" class="form-control" name="password" required autocomplete="new-password">

              </div>
            </div>

            <div class="row mb-0">
              <div class="col-md-6 offset-md-4">
                <button type="submit" class="btn btn-primary">
                  Register
                </button>
              </div>
              <div>
                <a href="login.jsp">already have account</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<%@include file="/include/_footer.jsp" %>
