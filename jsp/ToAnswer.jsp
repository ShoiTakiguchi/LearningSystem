<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="beans.Question"%>
<%
Question question = (Question) request.getAttribute("question");

%>
<HTML>
<BODY>
	<BR>
	<FORM action="./ToAnswerServlet" method="post">
		<TR>
			<TD width="40%">
				<p align="center">問題</p>
			</td>
			<TD width="60%">
				<p align="center">
					<%
					out.println(question.getQuestion_content());
					%>
				</p>
			</td>
		</TR>
		<INPUT type="radio" name="choice" value="1" />
		<%
			out.println(question.getChoice_1());
		%>
		<br>
		<INPUT type="radio" name="choice" value="2" />
		<%
			out.println(question.getChoice_2());
		%>
		<br>
		<INPUT type="radio" name="choice" value="3" />
		<%
			out.println(question.getChoice_3());
		%>
		<br>
		<INPUT type="radio" name="choice" value="4" />
		<%
			out.println(question.getChoice_4());
		%>
		<br>

		<br> <INPUT type="submit" name="button" value="解答" />
	</FORM>
</BODY>
</HTML>
