<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<HTML>
<BODY>
学習する教科・科目をしてください<BR>
<FORM action="./GetQuestionServlet" method="post">
<p>
<INPUT type="radio" name="question_subject" value="1" />国語
<INPUT type="radio" name="question_subject" value="2" />数学
<INPUT type="radio" name="question_subject" value="3" />英語
<INPUT type="radio" name="question_subject" value="4" />社会
<INPUT type="radio" name="question_subject" value="5" />理科
<INPUT type="submit" name="button"  value="教科を選択" />
</p>
</FORM>