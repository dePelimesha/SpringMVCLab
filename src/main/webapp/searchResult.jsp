<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Cars list</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 60%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Model</th>
        <th>Price</th>
    </tr>
    <c:forEach var="cars" items="${carsList}">
        <tr>
            <td>${cars.model}</td>
            <td>${cars.price}</td>
        </tr>
    </c:forEach>
</table>
<div>
    <form action="/go-to-cars-list" method="GET">
        <input type="submit" value="Return to cars list" >
    </form>
</div>
</body>
</html>

