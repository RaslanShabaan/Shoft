<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Lumino Columns - Bootstrap 4.0 Theme</title>
    <!--
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:100,300,400">   <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">                <!-- Font Awesome -->
    <link rel="stylesheet" href="css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="css/templatemo-style.css">                                   <!-- Templatemo style -->
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body id="top" class="page-2">


<form action="/Logout" method="get">
<button style="border: none;font-size: 20px;font-style: italic;;font-weight: bold;color:pitch;border-radius: 4%;margin-bottom: 3% ;margin-left: 30% "> Log Me Out :) </button>
</form>

<%
    HttpSession sesson=request.getSession();
    ArrayList ff =(ArrayList) sesson.getAttribute("sesson");
    int sizee=ff.size()/2;
    int pluss=0;
%>

<h2> All Posts :  <%= sizee %> </h2>

<table style="color: #025aa5;border: 1px solid #000" class="table table-striped tm-full-width-large-table">
    <thead>
    <tr>
        <th> Post Publisher :) </th>
        <th> Post :) </th>
    </tr>
    </thead>

    <%
        for(int count=0;count<sizee;count++ )
        {

    %>

    <tbody>
    <tr>
        <td> <%=  ff.get(pluss)      %> </td>
        <td> <%=  ff.get(pluss+1)    %> </td>
    </tr>
    </tbody>

    <%
            pluss=pluss+2;
        }
    %>
    
</table>
<script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
<script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
<script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
<script src="js/jquery.singlePageNav.min.js"></script>      <!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->

<!-- Templatemo scripts -->

</body>
</html>