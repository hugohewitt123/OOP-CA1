import java.util.ArrayList;
public class University {

	private ModuleDescriptor[] moduleDescriptors;
	
	private Student[] students;
	
	private Module[] modules;
    
    public University(ModuleDescriptor[] moduledesc_, Student[] students_, Module[] modules_){
        moduleDescriptors = moduledesc_;
        students = students_;
        modules = modules_;
    }
    
	/**
	 * @return The number of students registered in the system.
	 */
	public int getTotalNumberStudents() {
		// TODO - needs to be implemented
		return students.length;
	}

	/**
	 * @return The student with the highest GPA.
	 */
	public Student getBestStudent() {
		// TODO - needs to be implemented
        // need to specify "what" the method is being called on. in this case the class student.
		return Student.getbestgpa(this.students);
	}

	/**
	 * @return The module with the highest average score.
	 */
	public Module getBestModule() {
		// TODO - needs to be implemented
		return Module.gethighestmodule(this.modules);
	}
	
	public static void main(String[] args) {
		// TODO - needs to be implemented
     
        //%%%%%%%%%%%%%%%%Making module objects%%%%%%%%%%%%%%%%%%%%%%%
        String [][]table1 = new String[][]{{"Real World Mathematics", "ECM0002"}, {"Programming", "ECM1400"}, {"Data Structures", "ECM1406"}, {"Object-Oriented Programming", "ECM1410"}, {"Information Systems", "BEM2027"}, {"Thermal Physics", "PHY2023"}};
     
        double [][]table1Doubles = new double[][]{{0.1, 0.3, 0.6},{0.25, 0.25, 0.25, 0.25},{0.25, 0.25, 0.5},{0.2, 0.3, 0.5},{0.1, 0.3, 0.3, 0.3},{0.4, 0.6}}; 
     
        ModuleDescriptor ECM0002 = new ModuleDescriptor(table1[0][0], table1[0][1], table1Doubles[0]);
        ModuleDescriptor ECM1400 = new ModuleDescriptor(table1[1][0], table1[1][1], table1Doubles[1]);
        ModuleDescriptor ECM1406 = new ModuleDescriptor(table1[2][0], table1[2][1], table1Doubles[2]);
        ModuleDescriptor ECM1410 = new ModuleDescriptor(table1[3][0], table1[3][1], table1Doubles[3]);
        ModuleDescriptor BEM2027 = new ModuleDescriptor(table1[4][0], table1[4][1], table1Doubles[4]);
        ModuleDescriptor PHY2023 = new ModuleDescriptor(table1[5][0], table1[5][1], table1Doubles[5]);
     
        //%%%%%%%%%%maing student objects%%%%%%%%%%%%%%%%%%%%%%%%
        int []IDs = new int[]{1000,1001,1002,1003,1004,1005,1006,1007,1008,1009};
        String []names = new String[]{"Ana", "Oliver", "Mary", "John", "Noah", "Chico", "Maria", "Mark", "Lia", "Rachel"};
        char []genders = new char[]{'F', 'M', 'F', 'M', 'M', 'M', 'F', 'X', 'F', 'F'};
     
        Student []students_ = new Student[10];
        for (int i=0;i<10;i++){
            students_[i] = new Student(IDs[i], names[i], genders[i]);
            //System.out.println(students_[i]);
        }
        
        //%%%%%%%%%%%%making the module object%%%%%%%%%%%%%%%%%%%%%%%
        Module ECM0002Module = new Module(2020, (byte) 2, ECM0002);
        Module ECM1400Module = new Module(2019, (byte) 2, ECM1400);
        Module ECM1406Module = new Module(2020, (byte) 1, ECM1406);
        Module ECM1410Module = new Module(2020, (byte) 1, ECM1410);
        Module BEM2027Module = new Module(2019, (byte) 2, BEM2027);
        Module PHY2023Module = new Module(2019, (byte) 1, PHY2023);
        
        //%%%%%%%%%%%%%%%making module student and marks objects%%%%%%%%%%%%%%%%%%%%%%%%%%
        double [][]Marks = new double[][]{{9, 10, 10, 10}, {8, 8, 8, 9}, {5, 5, 6, 5}, {6, 4, 7, 9}, {10, 9, 10, 9}, {9, 9}, {6, 9}, {5, 6}, {9, 7}, {8, 5}, {10, 10, 9.5, 10}, {7, 8.5, 8.2, 8}, {6.5, 7.0, 5.5, 8.5}, {5.5, 5, 6.5, 7}, {7, 5, 8, 6}, {9, 10, 10, 10}, {8, 8, 8, 9}, {5, 5, 6, 5}, {6, 4, 7, 9}, {10, 9, 8, 9}, {10, 10, 10}, {8, 7.5, 7.5}, {9, 7, 7}, {9, 8, 7}, {2, 7, 7}, {10, 10, 10}, {8, 7.5, 7.5}, {10, 10, 10}, {9, 8, 7}, {8, 9, 10}, {10, 9, 10}, {8.5, 9, 7.5}, {10, 10, 5.5}, {7, 7, 7}, {5, 6, 10}, {8, 9, 8}, {6.5, 9, 9.5}, {8.5, 10, 8.5}, {7.5, 8, 10}, {10, 6, 10}};
        
        byte []term_ = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
        
        int []years_ = new int[]{2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020};
        
        Module []Modules_ = new Module[]{ECM1400Module, ECM1400Module, ECM1400Module, ECM1400Module, ECM1400Module, PHY2023Module, PHY2023Module, PHY2023Module, PHY2023Module, PHY2023Module, BEM2027Module, BEM2027Module, BEM2027Module, BEM2027Module, BEM2027Module, ECM1400Module, ECM1400Module, ECM1400Module, ECM1400Module, ECM1400Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1406Module, ECM1410Module, ECM1410Module, ECM1410Module, ECM1410Module, ECM1410Module, ECM0002Module, ECM0002Module, ECM0002Module, ECM0002Module, ECM0002Module};
     
        Student []Students = new Student[]{students_[0], students_[1], students_[2], students_[3], students_[4], students_[5], students_[6], students_[7], students_[8], students_[9], students_[0], students_[1], students_[2], students_[3], students_[4], students_[5], students_[6], students_[7], students_[8], students_[9], students_[0], students_[1], students_[2], students_[3], students_[4], students_[5], students_[6], students_[7], students_[8], students_[9], students_[0], students_[1], students_[2], students_[3], students_[4], students_[5], students_[6], students_[7], students_[8], students_[9]};
        
        
        //%%%%%%%%%%%making the student record object%%%%%%%%%%%%%%%%%%
        StudentRecord []studentRecords_ = new StudentRecord[40];
        double []finalmark = new double[40];
        for (int i=0;i<40;i++){
            for (int j=0;j<Marks[i].length;j++){
                double []weights = Modules_[i].getCAweightsm();
                finalmark[i] = finalmark[i] + (Marks[i][j] * weights[j] * 10);
            }
            studentRecords_[i] = new StudentRecord(Students[i], Modules_[i], Marks[i], finalmark[i]);
        }
        
        double []gpa = new double[10];
        int j=0;
        for (int i=0;i<10;j=j+10){
            gpa[i] = gpa[i] + studentRecords_[j].getfinalScore();
            if (j>=30){
                gpa[i] = gpa[i]/4;
                i++;
                j=i;
            }
        }
        
        Student []CompleteStudents_ = new Student[10];
        for (int i=0;i<10;i++){
            StudentRecord []studentsrecords_ = new StudentRecord[4];
            int p = 0;
            for (j=0;j<40;j++){
                if (studentRecords_[j].getStudent() == students_[i]){
                    studentsrecords_[p] = studentRecords_[j];
                    p++;
                }
            }
            CompleteStudents_[i] = new Student(IDs[i], names[i], genders[i], studentsrecords_, gpa[i]);
        }
        //%%%%%%%%%%%%%%%Creating new module objects with the student records and average scores%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
        ModuleDescriptor []modulestoadd = new ModuleDescriptor[]{ECM0002, ECM1400, ECM1406, ECM1410, BEM2027, PHY2023};
        StudentRecord [][]moduleStudents = new StudentRecord[6][10];
        double []averageScore = new double[]{0,0,0,0,0,0};
        for (j=0;j<6;j++){
            int p=0;
            for (int i=0;i<40;i++){
                if (studentRecords_[i].getModule().getmoduled().getcode() == modulestoadd[j].getcode()){
                    moduleStudents[j][p] = studentRecords_[i];
                    averageScore[j] = averageScore[j] + studentRecords_[i].getfinalScore();
                    p++;
                }
            }
            averageScore[j] = averageScore[j]/p;
        }
        Module ECM0002ModuleNew = new Module(2020, (byte) 2, ECM0002, moduleStudents[0], averageScore[0]);
        Module ECM1400ModuleNew = new Module(2019, (byte) 2, ECM1400, moduleStudents[1], averageScore[1]);
        Module ECM1406ModuleNew = new Module(2020, (byte) 1, ECM1406, moduleStudents[2], averageScore[2]);
        Module ECM1410ModuleNew = new Module(2020, (byte) 1, ECM1410, moduleStudents[3], averageScore[3]);
        Module BEM2027ModuleNew = new Module(2019, (byte) 2, BEM2027, moduleStudents[4], averageScore[4]);
        Module PHY2023ModuleNew = new Module(2019, (byte) 1, PHY2023, moduleStudents[5], averageScore[5]);
        
        //%%%%%%%%%%%%creating the university object%%%%%%%%%%%%%%%%%%%%%%%%
        
        ModuleDescriptor []moduledescriptors = new ModuleDescriptor[]{ECM0002, ECM1400, ECM1406, ECM1410, BEM2027, PHY2023};
        
        Module []modules_ = new Module[]{ECM0002ModuleNew, ECM1400ModuleNew, ECM1406ModuleNew, ECM1410ModuleNew, BEM2027ModuleNew, PHY2023ModuleNew};
        
        University university = new University(moduledescriptors, CompleteStudents_, modules_);
        
        // You need to create and instantiate university object
        // this can be done in several ways, for instance, you can create an "empty" university and add
        // module descriptors, students, and modules, or you can create a university object already "complete".
     
        // These decisions about how and where to implement each functionality is part of your OO design.
        // Regardless of your choice, in the end you need to have the university object loaded with the given
        // input data.
        
        // TODO create and initialise the university
        
        // Print Reports     
        System.out.println();
        System.out.println("The UoK has " + university.getTotalNumberStudents() + " students.");

        // best module
        System.out.println("\nThe best module is:");
        System.out.println(university.getBestModule());

        // best student
        System.out.println("\nThe best student is:");
        System.out.println(university.getBestStudent().printTranscript());
        System.out.println();
	}
}
