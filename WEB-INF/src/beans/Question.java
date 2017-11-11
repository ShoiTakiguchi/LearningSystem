 package beans;

public class Question {
	private int question_id = 0;
	private String question_content=null;
	private int question_answer=0;
	private String choice_1=null;
	private String choice_2=null;
	private String choice_3=null;
	private String choice_4=null;
	private int question_subject=0;

	public Question(int question_id,String question_content,int question_answer,
			String choice_1,String choice_2,String choice_3,String choice_4,int question_subject)
		{
		this.question_id=question_id;
		this.question_content=question_content;
		this.question_answer=question_answer;
		this.choice_1=choice_1;
		this.choice_2=choice_2;
		this.choice_3=choice_3;
		this.choice_4=choice_4;
		this.question_subject=question_subject;

		}

	public Question() {
	}

	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_content() {
		return question_content;
	}
	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}
	public int getQuestion_answer() {
		return question_answer;
	}
	public void setQuestion_answer(int question_answer) {
		this.question_answer = question_answer;
	}
	public String getChoice_1() {
		return choice_1;
	}
	public void setChoice_1(String choice_1) {
		this.choice_1 = choice_1;
	}
	public String getChoice_2() {
		return choice_2;
	}
	public void setChoice_2(String choice_2) {
		this.choice_2 = choice_2;
	}
	public String getChoice_3() {
		return choice_3;
	}
	public void setChoice_3(String choice_3) {
		this.choice_3 = choice_3;
	}
	public String getChoice_4() {
		return choice_4;
	}
	public void setChoice_4(String choice_4) {
		this.choice_4 = choice_4;
	}

	public int getQuestion_subject() {
		return question_subject;
	}

	public void setQuestion_subject(int question_subject) {
		this.question_subject = question_subject;
	}

}