import java.io.FileWriter;
import java.io.IOException;

public class SignUp{
	private String name;
	private String pass;
	private String dob;
	private String email;
	private String mobile;
	private String address;
	private String gender;
	
	public SignUp(String name,String pass,String dob,String email,String mobile,String address,String gender){
		this.name=name;
		this.pass=pass;
		this.dob=dob;
		this.email=email;
		this.mobile=mobile;
		this.address=address;
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public String getPass(){
		return pass;
	}
	public String getDob(){
		return dob;
	}
	public String getEmail(){
		return email;
	}
	public String getMobile(){
		return mobile;
	}
	public String getAddress(){
		return address;
	}
	public String getGender(){
		return gender;
	}
	public String getUserInfo(){
		return name + ":" + pass + ":" + dob + ":" + email + ":" + mobile + ":" + address + ":" + gender;
	}
	public boolean saveData(){
		try{
			FileWriter writer=new FileWriter("C:\\Users\\shaha\\OneDrive\\Desktop\\grp-1 Final Project\\user.txt", true);
			writer.write(getUserInfo()+System.lineSeparator());
			writer.close();
			return true;
		}catch (IOException io){
			io.printStackTrace();
			return false;
		}
	}
	
}