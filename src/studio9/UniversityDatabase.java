package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;




public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private Map<String, Student> universityData;
	
	public UniversityDatabase() {
		this.universityData = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		universityData.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return universityData.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(universityData.get(accountName)!=null)
			return universityData.get(accountName).getFullName();
		else
			return null;
	}

	public double getTotalBearBucks() {
		double total = 0;
		for(String key: universityData.keySet()) {
			total += universityData.get(key).getBearBucksBalance();
		}
		
		return total;
	}
}
