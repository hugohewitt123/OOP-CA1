public class ModuleDescriptor {
	
	private String code;
	
	private String name;
	
	private double[] continuousAssignmentWeights;
	
	public ModuleDescriptor(String moduleName, String moduleCode, double[] CAweights){
        name = moduleName;
        code = moduleCode;
        continuousAssignmentWeights = CAweights;
	}
	
	public double[] getCAweights(){
        return this.continuousAssignmentWeights;
	}
	
	public String getcode(){
        return this.code;
	}
	
	public String toString() {
        String word = "";
        word += ("\t" + name + " " + code);
        return word;
    }

}
