<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
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
    <title>New Accident</title>
</head>
<body>
<div class="container pt-3">
    <div class="row">
        <form action="<c:url value='/item/save' />" method='POST' style="width: 100%">
            <input type="hidden" name="id" value="0" />" />
            <table class="table table-bordered">
                <tr>
                    <td>Name:</td>
                    <td><input type='text' name='name' class="form-control"></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><textarea name="text" class="form-control"></textarea></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type='text' name='address' class="form-control"></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="Save" class="btn btn-success"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>