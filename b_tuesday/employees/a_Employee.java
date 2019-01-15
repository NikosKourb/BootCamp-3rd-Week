package employees;

public abstract class  a_Employee {

	
		
		private String name;
		private String surname;
		private String id;
		private String insuranceBody;
		private String jobDesc;
		
		
		public a_Employee() {}
		
		public a_Employee(String n,String s,String id,String ib,String jd) {
			this.name=n;
			this.surname=s;
			this.id=id;
			this.insuranceBody=ib;
			this.jobDesc=jd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInsuranceBody() {
			return insuranceBody;
		}

		public void setInsuranceBody(String insuranceBody) {
			this.insuranceBody = insuranceBody;
		}

		public String getJobDesc() {
			return jobDesc;
		}

		public void setJobDesc(String jobDesc) {
			this.jobDesc = jobDesc;
		}
		
		public abstract String toString();
		public abstract double pay();
}
