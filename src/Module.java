public class Module {
	
	private int year;
	
	private byte term;
	
	private ModuleDescriptor module;
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;
	
	public Module(int year_, byte term_, ModuleDescriptor module_){
        year = year_;
        term = term_;
        module = module_;
        //records = records_;
	}
	
	public Module(int year_, byte term_, ModuleDescriptor module_, StudentRecord[] records_, double finalAverageGrade_){
        year = year_;
        term = term_;
        module = module_;
        records = records_;
        finalAverageGrade = finalAverageGrade_;
	}
	
	public double[] getCAweightsm(){
        return this.module.getCAweights();
	}
	
	public int getyear(){
        return this.year;
	}
	
	public byte getterm(){
        return this.term;
	}
	
	static public Module gethighestmodule(Module[] modules_){
        Module []modules = modules_;
        double max = 0;
        Module moduleName = modules[0];
        for (int i=0;i<modules.length;i++){
            if (modules[i].finalAverageGrade > max){
                max = modules[i].finalAverageGrade;
                moduleName = modules[i];
            }
        }
        return moduleName;
	}
	
	public double getaveragegrade(){
        return this.finalAverageGrade;
	}
	
	public ModuleDescriptor getmoduled(){
        return this.module;
	}
	
	public String toString() {
        String word = "";
        word += (module + ", Year: " + this.year + ", Term: " + this.term + ", with an average grade of: " + this.finalAverageGrade + "%");
        word += ("\r\n");
        return word;
	}
}
