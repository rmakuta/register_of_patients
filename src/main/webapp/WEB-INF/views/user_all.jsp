<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Register of patients</title>

    <!-- Custom fonts for this template-->
    <link href="resources/boot/vendor/fontawesome-free/css/all.min.css" type="text/css"/>

    <!-- Page level plugin CSS-->
    <link href="/resources/boot/vendor/datatables/dataTables.bootstrap4.min.css rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/resources/boot/css/sb-admin.min.css" rel="stylesheet">

</head>

<body id="page-top">

<jsp:include page="/WEB-INF/views/nav.jsp"/>

<div id="wrapper">

    <!-- Sidebar -->
    <jsp:include page="/WEB-INF/views/menu_left.jsp"/>

    <div id="content-wrapper">

        <div class="container-fluid">

            <!-- Breadcrumbs-->
<%--            <ol class="breadcrumb">--%>
<%--                <li class="breadcrumb-item">--%>
<%--                    <a href="#">Dashboard</a>--%>
<%--                </li>--%>
<%--                <li class="breadcrumb-item active">Overview</li>--%>
<%--            </ol>--%>

            <!-- Icon Cards-->
            <jsp:include page="/WEB-INF/views/menu_add.jsp"/>

            <!-- DataTables Example -->
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fas fa-table"></i>
                     Pacjenci</div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                            <tr>
                                <th>Imię i nazwisko</th>
                                <th>Adres</th>
                                <th>PESEL</th>
                                <th>Telefon</th>
                                <th></th>
                                <th></th>
                            </tr>
                            </thead>
                            <tfoot></tfoot>
                            <tbody>
                            <c:forEach items="${users}" var="user">
                                <tr>
                                    <td> ${user.firstName} ${user.lastName}</td>
                                    <td>ul. ${user.street} ${user.houseNumber}, ${user.postalCode} ${user.city}</td>
                                    <td>${user.pesel}</td>
                                    <td>${user.numberPhone}</td>
                                    <td>
                                        <a href="/home/user/delete/${user.id}" name="delete">Usuń</a>
                                    </td>
                                    <td>
                                        <a href="/home/user/edit/${user.id}" name="edit">Edytuj</a>
                                    </td>
                                </tr>
                            </c:forEach><br>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
            </div>

        </div>
        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright © Your Website 2019</span>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/resources/boot/vendor/jquery/jquery.min.js"></script>
<script src="/resources/boot/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/boot/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Page level plugin JavaScript-->
<script src="/resources/boot/vendor/chart.js/Chart.min.js"></script>
<script src="/resources/boot/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="/resources/boot/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/resources/boot/js/sb-admin.min.js"></script>

<!-- Demo scripts for this page-->
<script src="/resources/boot/js/demo/datatables-demo.js"></script>
<script src="/resources/boot/js/demo/chart-area-demo.js"></script>

</body>

</html>

