 <body>
 <jsp:useBean id="u" class="model.Login" scope="request">
 <jsp:setProperty name="u" property="*"/>
 </jsp:useBean>
 you entered your username as <jsp:getProperty property="user" name="u"/>
 you entered your password as <jsp:getProperty property="pass" name="u"/>
 
 you are <%= u.validate("admin","admin") %>
</body>