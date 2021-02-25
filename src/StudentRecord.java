public class StudentRecord {

	private Student student;
	
	private Module module;
	
	private double[] marks;
	
	private double finalScore;
	
	private Boolean isAboveAverage;
	
	public StudentRecord(Student Student_, Module Module_, double[] Marks_, double finalScore_){
        student = Student_;
        module = Module_;
        marks = Marks_;
        finalScore = finalScore_;
	}
	
	public double[] getMarks(){
        return this.marks;
	}
	
	public double getfinalScore(){
        return this.finalScore;
	}
	
	public Module getModule(){
        return this.module;
	}
	
	public Student getStudent(){
        return this.student;
	}
	
	public String toString() {
        String word = "";
        word += (student + " " + module + " " + finalScore);
        word += ("\r\n");
        return word;
    }
	
}
