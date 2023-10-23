
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
  <%@include file="/include/_head.jsp" %>
  <title>Login</title>
</head>
<body>

<%@include file="/include/_nav.jsp" %>

<div class="container container-auth">
  <div class="row">
    <div class="col-md-6 d-flex justify-content-center align-items-center" id="logo-auth">
      <img src="assets/images/logo.png" alt="Resourcium Optima">
    </div>
    <div class="col-md-5">
      <div class="card border border-black border-2 p-3" id="auth-text">
        <div class="h1 m-auto mt-3 mb-2 title">Login

          <hr class="borderOfLineOfLogin"></div>

        <c:if test="${not empty error}">
          <div class="text-danger text-center mb-2">
              ${error}
          </div>
        </c:if>

        <div class="card-body mb-2">
          <form method="POST" action="<c:url value="login.py"/>">
            <div class="row mb-3">
              <label for="email" class="col-md-4 col-form-label text-md-end">Email Address</label>

              <div class="col-md-8">
                <input id="email" type="email" class="form-control" name="email" value="" required autocomplete="email" autofocus>

              </div>
            </div>

            <div class="row mb-3">
              <label for="password" class="col-md-4 col-form-label text-md-end">Password</label>

              <div class="col-md-8">
                <input id="password" type="password" class="form-control" name="password" required autocomplete="current-password">
              </div>
            </div>

            <div class="row mb-3">
              <div class="col-md-6 offset-md-4">
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" name="remember" id="remember">

                  <label class="form-check-label" for="remember">
                    Remember Me
                  </label>
                </div>
              </div>
            </div>

            <div class="row mb-0">
              <div class="col-md-8 offset-md-4">
                <button type="submit" class="btn btn-primary">
                  Login
                </button>
              </div>
              <div>
                <a href="register.jsp">create your account</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<%@include file="/include/_footer.jsp" %>


