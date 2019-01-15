package cb;

import java.util.Comparator;
import java.util.Date;

public class Student {
	
	
	private String fName;
	private String lName;
	private int age;
	private double height;
	private double tuition;
	private Date date;
	private String dateString;
	private long phone;
	private String conduct;
	
	//STUDENT Default CONSTRUCTOR
	public Student() {
	}
	
	
	//STUDENT CONSTRUCTOR
	public Student(String fName,String lName,int age,double height,String heightString,
			double tuition,Date date,String dateString,long phone,String conduct) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.height = height;
		this.tuition = tuition;
		this.date=date;
		this.dateString = dateString;
		this.phone = phone;
		this.conduct=conduct;
		}

	
	//FIRST NAME get-set
	public String getFName() {
		return fName;
	}
	public void setFName(String fn) {
		fName = fn;
	}

	
	//LAST NAME get-set
	public String getLName() {
		return lName;
	}
	public void setLName(String ln) {
		lName = ln;
	}

	
	//AGE get-set
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}

	
	//HEIGHT get-set
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}

	
	//TUITION get-set
	public double getTuition() {
		return tuition;
	}
	public void setTuition(double t) {
		tuition = t;
	}

	
	//DATE & DATE STRING get-set
	public Date getDate() {
		return date;
	}
	public void setDate(Date d) {
		date = d;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String ds) {
		dateString = ds;
	}
	
	
	//PHONE get-set
	public long getPhone() {
		return phone;
	}
	public void setPhone(long p) {
		phone = p;
	}
	
	
	//CONDUCT get-set
	public String getConduct() {
		return conduct;
	}
	public void setConduct(String c) {
		conduct = c;
	}
	
	
	//FIRST NAME Comparator
	public static Comparator<Student> fNameComp=new Comparator<Student>() {

		public int compare(Student std1, Student std2) {
			String stdFName1 = std1.getFName();
			String stdFName2 = std2.getFName();

		   return stdFName1.compareTo(stdFName2);
		   }
		};
	
	
	//LAST NAME Comparator
	public static Comparator<Student> lNameComp=new Comparator<Student>() {
		
		public int compare(Student std1,Student std2) {
		    String stdLName1=std1.getLName();
			String stdLName2=std2.getLName();
			return stdLName1.compareTo(stdLName2);
			}
		};
		
	
	//AGE Comparator
	public static Comparator<Student> ageComp=new Comparator<Student>() {

		public int compare(Student std1, Student std2) {
			int stdAge1=std1.getAge();
			int stdAge2=std2.getAge();
			return stdAge1-(stdAge2);
			}
		};
	
	
	//HEIGHT Comparator
	public static Comparator<Student> heightComp = new Comparator<Student>() {
		
		public int compare(Student std1, Student std2) {
			double stdHeight1 = std1.getHeight();
			double stdHeight2 = std2.getHeight();
			return Double.compare(stdHeight1,stdHeight2);
			}
		};
	
	
	//TUITION Comparator
	public static Comparator<Student> tuitionComp = new Comparator<Student>() {
		
		public int compare(Student std1, Student std2) {
			double stdTuition1 = std1.getTuition();
			double stdTuition2 = std2.getTuition();
			return Double.compare(stdTuition1,stdTuition2);
			}
		};
		
		
	//DATE Comparator
	public static Comparator<Student> dateComp = new Comparator<Student>() {
		
		public int compare(Student std1, Student std2) {
			Date stdDate1 = std1.getDate();
			Date stdDate2 = std2.getDate();
			return stdDate1.compareTo(stdDate2);
			}
		};


    //PHONE Comparator
	public static Comparator<Student> phoneComp = new Comparator<Student>() {
		
		public int compare(Student std1, Student std2) {
			long stdPhone1 = std1.getPhone();
			long stdPhone2 = std2.getPhone();
			return Long.compare(stdPhone1,stdPhone2);
			}
		};
		
	
    //CONDUCT Comparator
	public static Comparator<Student> conductComp=new Comparator<Student>() {
		
		public int compare(Student std1, Student std2) {
			String stdConduct1 = std1.getConduct();
			String stdConduct2 = std2.getConduct();
			return stdConduct1.compareTo(stdConduct2);
			}
		};
		
		
}
