<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    <html xmlns="http://www.w3.org/1999/xhtml">
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <title>[  Shoft :) ]</title>
	  
<link rel="stylesheet" href="css/index.css" />
<script type="colorScheme" class="swatch active">
  {
    "name":"Default",
    "bgBody":"333333",
    "link":"7E8564",
    "color":"AAAAAA",
    "bgItem":"ffffff",
    "title":"444444"
  }
</script>
  </head>
  <body paddingwidth="0" paddingheight="0"  style="padding-top: 0; padding-bottom: 0; padding-top: 0; padding-bottom: 0; background-repeat: repeat; width: 100% !important; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%; -webkit-font-smoothing: antialiased;" offset="0" toppadding="0" leftpadding="0">


<form action="/SelectNews" method="get">
<button style="border: none;font-size: 20px;font-style: italic;;font-weight: bold;color:pitch;border-radius: 4%;margin-bottom: 3% ;margin-left: 30% "> See All News Now :) </button>
</form>


    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableContent bgBody" align="center" style='font-family:Helvetica, Arial,serif;'>
  <tbody>
    <tr>
      <td><table width="600" border="0" cellspacing="0" cellpadding="0" align="center" class="MainContainer" bgcolor="#333333">
  <tbody>
    <tr>
<!-- =============================== Body ====================================== -->
      <td class='movableContentContainer'>
      	<div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0"  align="center" bgcolor='#C4CAA9'>
                <tr><td height='28' colspan='4'></td></tr>
                <tr>
                  <td width='28'></td>

                  <td align='left' valign='middle' >
                     <div class="contentEditableContainer contentTextEditable" style='display:inline-block;'>
                      <div class="contentEditable" >
                            <h1>Hello <b><c:out value="${pageContext.request.remoteUser}"/></b> </h1>
                                                                   
                      </div>
                    </div>
                  </td>

                  <td width='28'></td>
                </tr>
                <tr><td height='28' colspan='4'></td></tr>
              </table>
      </div>
      <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#ffffff">
  <tbody>
    <tr>
      <td height="30"></td>
    </tr>
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td valign="top" width="28">&nbsp;</td>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td valign="top"><div class="contentEditableContainer contentImageEditable">
                      <div class="contentEditable" >
                        <img src="images/logo.png" alt='Compagnie logo' data-default="placeholder" data-max-width="300" width='80' height='80' border="0">
                      </div>
                    </div></td>
	
	</tr>
  </tbody>
</table>
</td>
      <td valign="top" width="28">&nbsp;</td>
    </tr>
  </tbody>
</table>
</td>
    </tr>
    <tr>
      <td height="30"></td>
    </tr>
  </tbody>
</table>

      </div>
      <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td valign="top" width="600"><div class="contentEditableContainer contentImageEditable">
                <div class="contentEditable" >
                  <img class="banner" src="images/bigImg.jpg" alt='Featured images' data-default="placeholder" data-max-width="600" width='600' height='338' border="0">
                </div>
              </div></td>
    </tr>
  </tbody>
</table>

      </div>
      <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0"  align="center" bgcolor='#E4A552'>  
                <tr><td height='25' colspan='3'></td></tr>

                <tr>
                  <td width='25'></td>
                  
                  <td>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0"  align="center">
                      <tr>
                        <td>
                          <div class="contentEditableContainer contentTextEditable">
                            <div class="contentEditable" >
                              <h1 style='font-size:16px;color:#ffffff;font-weight:normal;margin:0;'>Your company Name</h1>
                            </div>
                          </div>
                        </td>
                      </tr>
                      <tr><td height='10'></td></tr>
                      <tr>
                        <td>
                          <div class="contentEditableContainer contentTextEditable">
                            <div class="contentEditable" >
                              <p style='font-size:13px;color:#ffffff;margin:0;'>
                                Your mission statement, vision or purpose in one sentence. Keep it short in the email but if you need to expand, link to your website’s page.
                              </p>
                            </div>
                          </div>
                        </td>
                      </tr>
                    </table>
                  </td>

                  <td width='25'></td>
                </tr>

                <tr><td height='25' colspan='3'></td></tr>
              </table>
      </div>
      <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td height='10'></td>
    </tr>
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td bgcolor="#ffffff" width="295" class="specbundle"><table border="0" cellspacing="0" cellpadding="0"  align="center" width="100%">
                        <tr><td height='25' colspan='3'></td></tr>

                        <tr>
                          <td width='25'></td>
                          <td valign='top'>
                            <table border="0" cellspacing="0" cellpadding="0"  align="center">
                              <tr>
                                <td align='left'>
                                  <div class="contentEditableContainer contentTextEditable">
                                    <div class="contentEditable" >
                                      <h2 >Private Classes</h2>
                                    </div>
                                  </div>
                                </td>
                              </tr>
                              <tr><td height='15'></td></tr>
                              <tr>
							  
							    <td align="center">
                                  <div class="contentEditableContainer contentTextEditable">
                                    <div class="contentEditable" >
                            	<form action ="/PostNews" method="post">        
                                                  <textarea rows="5" cols="40" name="khaber"></textarea>
                                                              <input type="hidden"  name="${_csrf.parameterName}"	value="${_csrf.token}"/>
									</div>
                                  </div>
                                </td>
                              </tr>
                              <tr><td height='35px'></td></tr>
                              <tr>
                                <td align='left'>
                                  <div class="contentEditableContainer contentTextEditable">
                                    
									<div class="contentEditable" >
                                      <button target='_blank' class='link2' style='color:#000;font-size:15px;font-style:italic;font-weight:bold'> Da Elle Hasal :)</button>
                                    </div>
                                  </div>
                                </td>
                              </tr>
                            </table>
                          </td>
                          <td width='25'></td>
                        </tr>

                                             
                        <tr><td height='35' colspan='3'></td></tr>
                      </table>
					 
					 </td>
					 
					 	</form>
                                
   </tr>
  </tbody>
</table>
</td>
    </tr>
  </tbody>
</table>

      </div>
	  
	  
	  
      <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td valign="top" height="10"></td>
    </tr>
    <tr>
	
      </div>
	  
      
	  <div class="movableContent" style="border: 0px; padding-top: 0px; position: relative;">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tbody>
    <tr>
      <td valign="top" height="10"></td>
    </tr>
    <tr>
      <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
  
  </table>
</td>
    </tr>
  </tbody>
</table>

      </div>
            
  </tbody>
</table>
</td>

</td>
    </tr>
  </tbody>
</table>
</td>
    </tr>
    <tr>
      <td height="25"></td>
    </tr>
  </tbody>
</table>

	</body>
      </html>
