<html>
<head>
    <title>Profile</title>
    <link href="resources/header.css" rel="stylesheet">
</head>
<body>
<%@ include file="link.jsp" %>

<div class="container">
    <h1>Account name:</h1>
    <%=
    session.getAttribute("name")
    %>
    <br>
    <a href="trainings.jsp">My trainings</a>
</div>
</body>
</html>
