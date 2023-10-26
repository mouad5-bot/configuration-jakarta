<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/20/2023
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/include/_head.jsp" %>
    <title>Profile</title>
</head>
<body>
<%@include file="/include/_nav.jsp" %>


<div class="profilTitle m-4 text-center">
    <h3 > Welcome in you Profile <span style="color: brown"> ${user.getFirstName()} </span> ! </h3>
</div>
<div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <div class="card m-3">
                    <div class="card-body">
                        <div class="d-flex justify-content-between mt-3">
                            <div class='h3'>
                                <u>List of My equipement :</u>
                            </div>
                        </div>
                        <hr class="mb-3" />
                        <div class="table-responsive">
                            <table class="table mt-5 mb-3" id="myTable">
                                <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Name </th>
                                    <th scope="col">Category</th>
                                    <th scope="col">Location</th>
                                    <th scope="col">Status</th>
                                    <th scope="col"></th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr id="1">
                                    <th scope="row"> 1</th>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td class="d-flex justify-content-center">
                                        <div class="me-3">
                                            <form action="" method="GET">
                                                <button type="submit" onclick=""
                                                        class="btn btn-outline-warning border border-light"> <i class="bi bi-pencil"></i> Edit</button>
                                            </form>
                                        </div>
                                        <div class="me-3">
                                            <form action="" method="POST" id="form">

                                                <button type="submit" onclick=""  class="btn btn-outline-danger border border-light"> <i class="bi bi-trash"></i> Delete</button>
                                            </form>
                                        </div>
                                        <div>
                                            <button class="btn btn-outline-info border border-light"> <i class="bi bi-eye"></i> Show</button>
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="card m-3">
                    <div class="card-body">
                        <h2>
                            Edit Profile
                        </h2>
                        <hr class="w-25%" />
                        <form action="" method="POST">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="mb-4">
                                        <label class="form-label">First Name </label>
                                        <input
                                                type="text"
                                                class="form-control"
                                                name="name"
                                                value="${user.getFirstName()}"
                                        />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mb-4">
                                        <label class="form-label">Last Name </label>
                                        <input
                                                type="text"
                                                class="form-control"
                                                name="name"
                                                value="${user.getLastName()}"
                                        />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mb-4 mr-2">
                                        <label class="form-label" >Email </label>
                                        <input
                                                type="email"
                                                class="form-control"
                                                name="email"
                                                value="${user.getEmail()}"
                                                disabled
                                        />
                                    </div>
                                </div>
                                <div>
                                    <button
                                            type="submit"
                                            id="save"
                                            name="save_Changes"
                                            class="btn btn-primary"
                                    >
                                        Save Changes
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="card m-3">
                    <div class="card-body">
                        <h2>
                            Change Password
                        </h2>
                        <hr class="w-25%" />
                        <form action="" method="POST">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="mb-4">
                                        <label for="oldPasswordInput" class="form-label">Old Password</label>
                                        <input name="old_password" type="password" class="  form-control" id="oldPasswordInput">

                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mb-4">
                                        <label class="form-label"
                                        >New password
                                        </label>
                                        <input
                                                type="password"
                                                class=" form-control"
                                                name="new_password"
                                        />
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <div class="mb-4">
                                        <label class="form-label"
                                        >Conferm password</label
                                        >
                                        <input
                                                type="password"
                                                class="form-control"
                                                name="new_password_confirmation"
                                        />
                                    </div>
                                </div>
                                <div>
                                    <button
                                            type="submit"
                                            name="save_Changes"
                                            class="btn btn-primary"
                                            onclick="update()"
                                    >
                                        Save Changes
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="card m-3">
                    <div class="card-body">
                        <h2>
                            Delete Your Account
                        </h2>
                        <hr />

                        <form action="" method="POST">
                            <div>
                                <i>Delete your account and all information related to your account such as your profile page, products published … Please be aware that all data will be permanently lost if you delete your account.</i>
                            </div>
                            <button
                                    type="submit"
                                    name="save_Changes"
                                    class="btn btn-danger mt-3"
                                    onclick=""
                            >
                                Delete Account
                            </button>
                    </div>
                </div>
                </form>
            </div>
        </div>
    </div>
</div>
</div>

<%@include file="/include/_footer.jsp" %>
