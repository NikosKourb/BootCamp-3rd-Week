package hashmap;

public class Student implements Comparable {
	
	public String name;
	public int score;

	public Student(String n,int sc) {
		name = n;
		score = sc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setNumber(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.score-((Student)o).score;
	}

}
