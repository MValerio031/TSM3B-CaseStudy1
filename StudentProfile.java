public class StudentProfile{
  private String Name;
  private String Age;
  private String Gender;
  private String StudentEmail;
  private String StudentNumber;
  private String CourseSection;
  private String StudentMajor;
  private String YearLevel;
  private String CollegeName;

  public Person(String name,String age, String gender, String email, String studentnum, String cs, String major, String yearlvl, String cn){
	setName(name);
	setAge(age);
	setGender(gender);
	setStudentEmail(email);
	setStudentNumber(studentnum);
	setCourseSection(cs);
	setStudentMajor(major);
	setYearLevel(yearlvl);
	setCollegeName(cn);	

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
  public String getStudentEmail(){
    return email;
	}
  public void setStudentNumber(String email){
    this.email=email;
	}
  public String getStudentNumber(){
    return studentnum;
	}
  public void setStudentNumber(String studentnum){
    this.studentnum=studentnum;
	}
  public String getCourseSection(){
    return cs;
	}
  public void setStudentNumber(String cs){
    this.cs=cs;
	}

public String getStudentMajor(){
    return major;
	}

public void setStudentMajor(String major){
    this.major=major;
	}

public String getYearLevel(){
    return yearlvl;
	}

public void setStudentNumber(int yearlvl){
    this.yearlvl=yearlvl;
	}

public String getCollegeName(){
    return cn;
	}

public void setStudentNumber(String cn){
    this.cn=cn;
	}
}
