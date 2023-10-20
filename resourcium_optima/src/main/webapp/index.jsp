<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title> Home page - RO </title>
    <%@include file="/include/head.jsp" %>
</head>
<body>
    <%@include file="/include/nav.jsp" %>

    <div class="homeLogo" >
        <img src="assets/images/logo.png" alt="logo" id="homeLogo">
    </div>
    <div class="row justify-content-center " id="card">
        <div class="col-6 mt-5" id="card-child">
            <div class="card text-center" >
                <div class="card-header">
                    <h1>Welcom in home page</h1>
                </div>
                <div class="card-body">
                    <h5 class="card-title">Resourcium Optima</h5>
                    <p class="card-text">Bienvenue dans l'application Resourcium Optima, qui vous permet de gérer
                        l'équipement de votre entreprise et de demander leur disponibilité.
                        Inscrivez-vous maintenant. </p>
                    <ul class="text-start">
                        <li>Vous avez deja un compte <a href="login.jsp" class="">Login</a></li>
                        <li>Vous n'avez pas un compte <a href="register.jsp" class="">Register</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>


<%@include file="/include/footer.jsp" %>