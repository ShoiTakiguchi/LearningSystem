package beans;

public class Progress {
	private String date = null;
	private String user_id = null;
	private int question_id = 0;
	private int user_answer = 0;
	private int correct_answer = 0;
	private int progress_id = 0;

	public Progress(String date,String user_id,int question_id,
			int user_answer,int correct_answer,int progress_id
)
	{
		this.date=date;
		this.user_id=user_id;
		this.question_id=question_id;
		this.user_answer=user_answer;
		this.correct_answer=correct_answer;
		this.progress_id=progress_id;

	}

	public Progress() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public int getUser_answer() {
		return user_answer;
	}

	public void setUser_answer(int user_answer) {
		this.user_answer = user_answer;
	}

	public int getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(int correct_answer) {
		this.correct_answer = correct_answer;
	}

	public int getProgress_id() {
		return progress_id;
	}

	public void setProgress_id(int progress_id) {
		this.progress_id = progress_id;
	}


}
