<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<BODY>
	問題を選んでください
	<BR>
	<FORM action="./SelectQuestionServlet" method="post">
		<c:forEach items="${question_list}" var="list">
			<input type="radio" name="question_id" value="${list.question_id}">${list.question_content}<br>
		</c:forEach>
		<INPUT type="submit" name="button" value="問題を選択" />
	</FORM>
</BODY>
</HTML>