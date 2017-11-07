<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>CodePen - Login</title>
    <link rel="stylesheet" href="css/stylee.css" media="screen" type="text/css" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">
</head>
<body onload='document.loginForm.j_username.focus();'>
      

<h1 style="color: #fff ;font-weight: bold;font-style: italic; font-size: 20px"> ${logout} </h1>      
    <div class="container">
<h1 style="color: #fff ;font-weight: bold;font-style: italic; "> ${Reg} </h1>

<h1 style="color: #fff ;font-weight: bold;font-style: italic; "> ${vcod} </h1>

    <!--  Login Fail  -->
    <c:if test="${not empty error}">
        <h1 style="color: #c7254e;font-weight: bold;font-style: italic;font-size: 30px">  ${error}</h1>
    </c:if>
<br><br>

      <div id="login">
        <form action="/Login" method="post">
            <p><span class="fontawesome-user"></span><input name="username" type="text"      placeholder="UserName"  required="required"></p> 
            <p><span class="fontawesome-lock"></span><input name="password" type="password"  placeholder="PassWord"  required="required"></p> 
            <input type="hidden"  name="${_csrf.parameterName}"	value="${_csrf.token}"/>
          	<p><input type="submit" value="Sign In"></p>
        </form>

        <form action="/GoRegister" method="get">
          	<p><input type="submit" value="Sign Up"></p>
        </form>
      </div> <!-- end login -->
    </div>

  </body>
</html>
