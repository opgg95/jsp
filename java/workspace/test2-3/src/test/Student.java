package test;

public class Student {
	 private String name;
	 private int ban;
	 private int no;
	 private int kor;
	 private int eng;
	 private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	Student std = new Student();
	
	
	
	private void say() {
		System.out.println(name);
		System.out.println(ban);
		System.out.println(no);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}
	public String toString() {
		return "Student [ name = "
				+ name 
				+ ",kor"+ kor 
				+ ", eng"+ eng
				+", math = "+ math + "]";
				
	}
	
	public String toString2() {
		return "Student [ (name = "
				+ name 
				+ ",kor"+ kor 
				+ ", eng"+ eng
				+", math)/3 = "+ math + "]";
			
		
	}
	
	
	
}
