<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/19/2023
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/include/_head.jsp" %>
    <title>landing page</title>
</head>
<body>

<%@include file="/include/_nav.jsp" %>

<div class="container">
    <div class="row justify-content-center mt-5 mb-5 ">
        <div class="col-6">
            <div class="card">
                <div class="row">
                    <div class="card-body col-sm-4 mt-4">
                        <h5 class="card-title text-center"> <b> Choose an equipements here  </b></h5>
                        <br>
                    </div>
                </div>
                <div class="card-footer	">
                    <form method="POST" action="<c:url value="reservation.py"/>">
                        <div class="row justify-content-center">
                            <div class="col-8">
                                <c:if test="${not empty equipments}">
                                <select name="reservationRO" class="form-select" id="reserve">
                                        <c:forEach items="${equipments}" var="equipment">
                                            <option value="${equipment.id}">${equipment.name}</option>
                                        </c:forEach>
                                </select>
                                </c:if>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-6 mt-4">
                                <button type="button" class="btn btn-primary btn-lg"> Reserve an equipement </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="card">
                <div class="row">
                    <div class="card-body col-sm-4 mt-4">
                        <h5 class="card-title text-center"> <b> Choose your task here  </b></h5>
                        <br>
                    </div>
                </div>
                <div class="card-footer	">
                    <form method="POST" action="">
                        <div class="row justify-content-center">
                            <div class="col-8">
                                <select name="exchange_product_id" class="form-select" id="exchange_product_id">
<%--                                    @foreach($products as $product)--%>
                                    <option value="id"> name e</option>
<%--                                    @endforeach--%>
                                </select>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-6 mt-4">
                                <button type="button" class="btn btn-primary btn-lg"> Get task </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="/include/_footer.jsp" %>
