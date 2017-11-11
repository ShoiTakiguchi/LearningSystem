<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<HTML>
<TITLE>学習ドリルシステム</TITLE>
<CENTER>
	<font size="4">問題を登録</font> <br> <br>
	<FORM method="POST" action="./QuestionRegistServlet">
		<CENTER>
			<TABLE border="0" cellpadding="0">
				<TBODY>
					<TR>
						<TD align="left"><FONT><B>問題文</B></FONT></TD>
						<TD><TEXTAREA name="question_content" rows="7" cols="70"></TEXTAREA></TD>
					</TR>
					<FONT>正答番号</FONT>
					<select name="question_answer">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
					<TR>
						<TD align="left"><FONT><B>①</B></FONT></TD>
						<TD><TEXTAREA name="choice_1" rows="1" cols="32"></TEXTAREA></TD>
					</TR>
					<TR>
						<TD align="left"><FONT><B>②</B></FONT></TD>
						<TD><TEXTAREA name="choice_2" rows="1" cols="32"></TEXTAREA></TD>
					</TR>
					<TR>
						<TD align="left"><FONT><B>③</B></FONT></TD>
						<TD><TEXTAREA name="choice_3" rows="1" cols="32"></TEXTAREA></TD>
					</TR>
					<TR>
						<TD align="left"><FONT><B>④</B></FONT></TD>
						<TD><TEXTAREA name="choice_4" rows="1" cols="32"></TEXTAREA></TD>
					</TR>
					<TR>
						<select name="question_subject">
							<option value="1">国語</option>
							<option value="2">数学</option>
							<option value="3">英語</option>
							<option value="4">社会</option>
							<option value="5">理科</option>
						</select>
					</TR>
				</TBODY>
			</TABLE>
		</CENTER>
		<br>
		<CENTER>
			<INPUT type="submit" value="問題登録">
	</FORM>
</CENTER>
</BODY>
</HTML>