<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<HTML>
<BODY>
あなたのIDとパスワードを入力してください<BR>
<FORM action= "./RegistUser" method="post">
ID<INPUT type="text" name ="user_id"><BR>
パスワード<INPUT type="text" name= "user_password">
<INPUT type="submit" name = "登録">
</FORM>
<BR>
ログインはこちら
<a href= "./login.jsp">Click here!</a>
</BODY>
</HTML>