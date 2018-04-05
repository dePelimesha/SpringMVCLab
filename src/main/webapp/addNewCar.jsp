<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add car</title>
</head>
<body>
<form action="/add-new-car" method="POST">
    <label>Title</label>
    <input type="text" name="model">
    <label>Price</label>
    <input type="text" name="price">
    <input type="submit" value="Add new car">
</form>
</body>
</html>
