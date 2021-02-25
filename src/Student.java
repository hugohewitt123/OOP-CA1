public class Student {
	
	private int id;
	
	private String name;
	
	private char gender;
	
	private double gpa;
	
	private StudentRecord[] records;
	
	public Student(int ID_, String Name_, char Gender_){
        id = ID_;
        name = Name_;
        gender = Gender_;
	}
	
	public Student(int ID_, String Name_, char Gender_, StudentRecord[] Records_, double gpa_){
        id = ID_;
        name = Name_;
        gender = Gender_;
        records = Records_;
        gpa = gpa_;
	}
	
	public double getgpa(){
        return this.gpa;
	}
	
	public StudentRecord[] getrecords(){
        return this.records;
	}
	
	public String toString() {
        String word = "";
        word += (id + " " + name + " " + gender + " " + gpa);
        word += ("\r\n");
        return word;
    }

    static public Student getbestgpa(Student[] students_){
        Student []students = students_;
        double max = 0;
        Student name = students[0];
        for (int i=0;i<students.length;i++){
            if (students[i].gpa > max){
                max = students[i].gpa;
                name = students[i];
            }
        }
        return name;
	}

	public String printTranscript() {
		// do something
		String report = "\t\tUniversity of Knowledge - Official Transcript\n\n ID: "+this.id+"\n Name: "+this.name+"\n GPA: "+this.gpa+"%\n\n";
		for (int i=0;i<4;i++){
            report = report +" | "+this.records[i].getModule().getyear()+" | "+this.records[i].getModule().getterm()+" | "+this.records[i].getModule().getmoduled().getcode()+" | "+this.records[i].getfinalScore()+" | \n";
            if (i>0){
                if (this.records[i].getModule().getterm() == this.records[i-1].getModule().getterm()){
                    report = report +"\n";
                }
            }
		}
		return report;
	}
}
