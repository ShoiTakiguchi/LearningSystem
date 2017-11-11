package beans;

public class User {

	private String user_id =null;
	private String user_password = null;
	private int user_role=0;

	public User(){

	}
	public User (String user_id,String user_password,int user_role)
	{
		this.user_id= user_id;
		this.user_password= user_password;
		this.user_role=user_role;

	}
	public String getUser_id(){
		return user_id;
	}
	public String getUser_password(){
	return user_password;
	}
	public void setUser_id(String user_id){
		this.user_id=user_id;
	}
	public void setUser_password(String user_password){
		this.user_password=user_password;
	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}
}
