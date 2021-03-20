public class StudentProfile{
  private String Name;
  private String Age;
  private String Gender;
 

  public Person(String name,String age, String gender){
	setName(name);
	setAge(age);
	setGender(gender);

	}
  public String getName(){
	return name;

	}
  public void setName(String name){
	this.name = name;
	}

  public String getAge(){
	return age;

	}
  public void setAge(String age){
	this.age = age;
	}


 public String getGender(){
	return gender;

	}
  public void setGender(String gender){
	this.gender = gender;
	}
  

}
