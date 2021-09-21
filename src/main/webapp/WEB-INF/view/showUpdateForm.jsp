<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index_css.css">
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
                <h2>Update Customer :</h2>
                <form:form action="updateCustomer" method="post" modelAttribute="customer">
                    <div class="form-group">
                        <label for="firstName">First Name</label>
                        <form:input type="text" class="form-control" id="firstName" placeholder="Enter First Name" path="firstName"/>
                    </div>
                    <div class="form-group">
                        <label for="lastName">Last Name</label>
                        <form:input type="text" class="form-control" id="lastName" placeholder="Enter Last Name" path="lastName"/>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <form:input type="email" class="form-control" id="email" placeholder="Enter Email" path="email"/>
                    </div>
                    <br>
                    <button type="submit" class="btn btn-success" Value="Update">Update Customer</button>
                </form:form>
            </div>
        </div>
    </main>
</body>
</html>