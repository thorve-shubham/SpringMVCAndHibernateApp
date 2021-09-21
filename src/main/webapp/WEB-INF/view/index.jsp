<!-- Setting up JSP variables -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <div class=" container">
                <div class="row">
                    <div class="col-md-12">
                        <h2>Customer App</h2>
                    </div>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="container">
                <hr>
                <a href="${contextPath}/customer/list">Show All Customers</a>
            </div>
        </div>
    </main>
</body>
</html>
