<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index_css.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/list-customer.js"></script>
    	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
    </head>
<body>
    <main>
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h2>Customer App</h2>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <div class="content">
            <div class="container">
                <a href="${contextPath}/customer/add"><button type="button" class="btn btn-success">+ Add Customer</button></a>
                <hr>
                <h3>Customers : </h3>
                <hr>
                <table class="table table-bordered">
                    <tr>
                      <th scope="col">#</th>
                      <th scope="col">First Name</th>
                      <th scope="col">Last Name</th>
                      <th scope="col">Email</th>
                      <th scope="col">Actions</th>
                    </tr>
                    <c:forEach var="customer" items="${customers}">
                        <c:url var="updateCustomerUrl" value="/customer/showUpdateForm">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>
                        <c:url var="deleteCustomerUrl" value="/customer/delete">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>
                        <tr>
                            <td scope="row">${customer.id}</td>
                            <td>${customer.firstName}</td>
                            <td>${customer.lastName}</td>
                            <td>${customer.email}</td>
                            <td><a href="${updateCustomerUrl}">Edit</a> | <a href="${deleteCustomerUrl}" onclick="confirmDelete('${customer.firstName}')">Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </main>
</body>