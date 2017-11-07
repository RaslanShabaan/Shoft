<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>CodePen - Login</title>
    <link rel="stylesheet" href="css/stylee.css" media="screen" type="text/css" />
</head>


<body>
  <html lang="en-US">
  <head>

    <meta charset="utf-8">

    <title>Login</title>

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">

    <!--[if lt IE 9]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
 <![endif]-->

  </head>

  <body>

    <div class="container">

      <div id="login">

        <form action="Register" method="post">

          <fieldset class="clearfix">

            <p> <span class="fontawesome-user"></span><input type="text"     name="UMail"   placeholder="E_Mail"    required="required" ></p>
            <p> <span class="fontawesome-user"></span><input type="text"     name="UName"   placeholder="UserName"  required="required"></p> 
            <p> <span class="fontawesome-lock"></span><input type="password" name="UPass" placeholder="PassWord"  required="required"></p> 
            <p> <span class="fontawesome-user"></span><input type="text"     name="UPhone"  placeholder="Phone"    required="required" ></p>
            
               <input type="hidden"  name="${_csrf.parameterName}"	value="${_csrf.token}"/>
          	
            <p><input type="submit" value="Sign Up"></p>

          </fieldset>

        </form>

      </div> <!-- end login -->

    </div>

  </body>
</html>

</body>

</html>