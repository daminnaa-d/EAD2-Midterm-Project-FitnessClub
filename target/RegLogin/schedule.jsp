<%@ page import="org.example.model.FitnessClub" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.example.model.Schedule" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="resources/schedule.css" rel="stylesheet">

    <title>Schedule</title>
</head>
<body>
<h2><a href="index.jsp">Home</a></h2>
<div class="container">
    <h2>Schedule</h2>
    <table>
        <tr>
            <th>Programme</th>
            <th>Time</th>
            <th>Price</th>
            <th>Trainer</th>
            <th>Sign for programme</th>
        </tr>
        <%
            ArrayList<Schedule> schedules = FitnessClub.getFitnessClub().getSchedules();
            for(Schedule schedule: schedules){
                out.println("<tr class=\"grey\">\n" +
                        "            <td>"+ schedule.getProgramme() + "</td>\n" +
                        "            <td>"+ schedule.getTime() + "</td>\n" +
                        "            <td>"+ schedule.getPrice() + " </td>\n" +
                        "            <td>"+ schedule.getTrainer() + "</td>\n" +
                        " <td><form action=\"schedule\" method=\"post\">\n" +
                        "            <input type=\"hidden\" name=\"schedule\" value='" + schedule.getProgramme() +"'>\n" +
                        "<input type='submit' value='Sign'>" +
                        "        </form></td>" +
                        "        </tr>");
            }
        %>
    </table>
</div>
</body>
</html>
