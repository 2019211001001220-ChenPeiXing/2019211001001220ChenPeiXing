<%--
  Created by IntelliJ IDEA.
  User: 86138
  Date: 2021/3/26
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<form method="post" action="/register"><!-- within doPost() in servlet-->
    username<input type="text" name="username"/><br/>
    password<input type="password" name="password"/><br/>
    Email<input type="text" name="email"/><br/>
    Gender :<input type="radio" name="gender">Male <input type="radio" name="gender">Female<br/>
    <!-- if name is same it make array -->
    Date of birth :<input type="text name" name="birthDate"><br/>
    <input type="submit" value="Register"/>
</form>

<%@include file="footer.jsp"%>