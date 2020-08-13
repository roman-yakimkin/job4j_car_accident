<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <title>Accident</title>
</head>
<body>
<div class="container">
    <div class="row pt-3">
        <div>Logged in as: ${user.username}</div>
        <div></div>
    </div>
    <div class="row pt-3">
        <a href="<c:url value='/accident/create'/>">Add an accident</a>
    </div>
    <div class="row pt-3">
        <table class="table table-bordered">
            <thead>
                <th>Name</th>
                <th>Description</th>
                <th>Address</th>
                <th>Actions</th>
            </thead>
            <tbody>
            <c:forEach items="${accidents}" var="item">
                <tr>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.text}" /></td>
                    <td><c:out value="${item.address}" /></td>
                    <td><a href="<c:url value="/accident/${item.id}/edit" />">edit</a>&nbsp;<a href="<c:url value="/accident/${item.id}/delete" />">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>