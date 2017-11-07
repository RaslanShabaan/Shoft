package com.arch.SendMail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
	
    String SendResult ;
    public String SendMail(String ReciverMail,String UserName,String V_Code)
    {

        // Sender's email ID needs to be mentioned
        String from = "nicuegypt303@gmail.com";
        String pass ="00000000RESO";
        // Recipient's email ID needs to be mentioned.

        //String to = "Mohamedsaad1994@outlook.com";
        String to = ReciverMail;
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try{
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Verification Code For Uour Mail  To Asked WebSite");
            // Now set the actual message
            message.setText("Dear M "+UserName+" Thank You For Using Our WebSite Please Click This Button To Verfiy Your Account  ");


            message.setContent("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                            "<head>\n" +
                            "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                            "  <title>[SUBJECT]</title>\n" +
                            "  <style type=\"text/css\">\n" +
                            "  body {\n" +
                            "   padding-top: 0 !important;\n" +
                            "   padding-bottom: 0 !important;\n" +
                            "   padding-top: 0 !important;\n" +
                            "   padding-bottom: 0 !important;\n" +
                            "   margin:0 !important;\n" +
                            "   width: 100% !important;\n" +
                            "   -webkit-text-size-adjust: 100% !important;\n" +
                            "   -ms-text-size-adjust: 100% !important;\n" +
                            "   -webkit-font-smoothing: antialiased !important;\n" +
                            " }\n" +
                            " .tableContent img {\n" +
                            "   border: 0 !important;\n" +
                            "   display: inline-block !important;\n" +
                            "   outline: none !important;\n" +
                            " }\n" +
                            "\n" +
                            "p, h1,h2,h3,ul,ol,li,div{\n" +
                            "  margin:0;\n" +
                            "  padding:0;\n" +
                            "}\n" +
                            "h1,h2{\n" +
                            "  font-weight: normal;\n" +
                            "  background:transparent !important;\n" +
                            "  border:none !important;\n" +
                            "}\n" +
                            "\n" +
                            "td,table{\n" +
                            "  vertical-align: top;\n" +
                            "}\n" +
                            "td.middle{\n" +
                            "  vertical-align: middle;\n" +
                            "}\n" +
                            "\n" +
                            "a{\n" +
                            "  text-decoration: none;\n" +
                            "}\n" +
                            "\n" +
                            "a.link1{\n" +
                            "  font-size: 16px;\n" +
                            "  color: #a5a5a5;\n" +
                            "}\n" +
                            "\n" +
                            "a.link2{\n" +
                            "font-size: 18px;\n" +
                            "font-weight: bold;\n" +
                            "color: #000000;\n" +
                            "text-decoration: underline;\n" +
                            "}\n" +
                            "\n" +
                            "a.link3{\n" +
                            "font-size: 15px;\n" +
                            "font-weight: bold;\n" +
                            "color: #ffffff;\n" +
                            "background-color: #2da4a8;\n" +
                            "padding: 11px 15px;\n" +
                            "text-decoration: none;\n" +
                            "border-radius:5px;\n" +
                            "-moz-border-radius:5px;\n" +
                            "-webkit-border-radius:5px;\n" +
                            "text-align: center;\n" +
                            "display:inline-block;\n" +
                            "}\n" +
                            "\n" +
                            ".contentEditable li{\n" +
                            "\n" +
                            "}\n" +
                            "\n" +
                            "h1{\n" +
                            "font-size: 24px;\n" +
                            "font-weight: bold;\n" +
                            "color: #000000;\n" +
                            "line-height: 150%;\n" +
                            "}\n" +
                            "\n" +
                            "\n" +
                            "h2{\n" +
                            "font-size: 18px;\n" +
                            "font-weight: bold;\n" +
                            "color: #000000;\n" +
                            "line-height: 150%;\n" +
                            "height:60px;\n" +
                            "}\n" +
                            "\n" +
                            "p{\n" +
                            "font-size: 16px;\n" +
                            "color: #000000;\n" +
                            "line-height: 150%;\n" +
                            "text-align: left;\n" +
                            "}\n" +
                            "\n" +
                            ".bgItem{\n" +
                            "background: #ffffff;\n" +
                            "}\n" +
                            "\n" +
                            ".bgBody{\n" +
                            "background: #3f4040;\n" +
                            "}\n" +
                            "</style>\n" +
                            "\n" +
                            "<script type=\"colorScheme\" class=\"swatch active\">\n" +
                            "{\n" +
                            "    \"name\":\"Default\",\n" +
                            "    \"bgBody\":\"3f4040\",\n" +
                            "    \"link\":\"555555\",\n" +
                            "    \"color\":\"000000\",\n" +
                            "    \"bgItem\":\"ffffff\",\n" +
                            "    \"title\":\"000000\"\n" +
                            "}\n" +
                            "</script>\n" +
                            "\n" +
                            "</head>\n" +
                            "<body paddingwidth=\"0\" paddingheight=\"0\" class='bgBody' style=\"padding-top: 0; padding-bottom: 0; padding-top: 0; padding-bottom: 0; background-repeat: repeat; width: 100% !important; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%; -webkit-font-smoothing: antialiased;\" offset=\"0\" toppadding=\"0\" leftpadding=\"0\">\n" +
                            "    <div class='movableContent'>\n" +
                            "      \n" +
                            "  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\n" +
                            "          <tr><td height='20'></td></tr>\n" +
                            "          <tr>\n" +
                            "            <td>\n" +
                            "              <table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class='bgItem' style='border-radius:5px;-moz-border-radius:5px;-webkit-border-radius:5px;'>\n" +
                            "                <tr><td colspan=\"5\" height='30'></td></tr>\n" +
                            "                <tr>\n" +
                            "                  <td width='20'></td>\n" +
                            "                  \n" +
                            "                  <td width='30'></td>\n" +
                            "                  <td width='305'>\n" +
                            "                    <div class=\"contentEditableContainer contentTextEditable\">\n" +
                            "                      <div class=\"contentEditable\" style=\"background-color:#adadad\">\n" +
                            "                        <h1 style='font-size: 24px;margin-left:10%'> It's Time! To Login to Your Account </h1>\n" +
                            "\n" +
                            "\t\t\t\t\t<h2>  you have successfully Registerd  to our web site . </h2>\n" +
                            "\t\t\t\t\t<h2>  Please Click This Link To Verify Your Account  :) </h2>\n" +
                         V_Code +
                            " <a href='http://localhost:60650/Check?Vcode="+V_Code+"' > Verify My Mail :)  </a>\n"+
                         
                            
                            
                            
                            "\t\t\t\t\t<form action=\"http://localhost:60650/Hom?Vcode="+V_Code+"\">\n" +
                            "\t\t\t\t\t<button style=\"width:40%;height:25%;font-size:18px;color:#d9534f;font-style:italic;font-weight:bold;bolder:none;margin:10%;margin-left:30%\"> Go To Ask WebSite </button>\n" +
                            "\t\t\t\t\t</form>\n" +
                            "  </div>\n" +
                            "                    </div>\n" +
                            "                  </td>\n" +
                            "                  <td width='20'></td>\n" +
                            "                </tr>\n" +
                            "                <tr><td colspan=\"5\" height='30'></td></tr>\n" +
                            "              </table>\n" +
                            "            </td>\n" +
                            "          </tr>\n" +
                            "        </table>\n" +
                            "      </div>\n" +
                            "\t  \n" +
                            "\t  \n" +
                            "</body>\n" +
                            "</html>"
                    , "text/html"


            );

            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
            SendResult ="Doen";
        }catch (MessagingException mex) {
            mex.printStackTrace();
            SendResult="NotDoen";
        }
        return SendResult;
    }

}
