<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<BODY>
	<BR>
	<FORM>

		<c:forEach items="${progress_list}" var="list">
		${list.date}
		${list.user_id}
		${list.question_id}
		あなたの答え:${list.user_answer}
		正答:${list.correct_answer}<br>
		</c:forEach>
		<FONT><a href="./UserTop.jsp">トップ画面に戻る</a></FONT><br>
	</FORM>
</BODY>
</HTML>