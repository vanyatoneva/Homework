package People;

public class Student extends Person {
	double score;
	
	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		if(score > 2 && score < 6){
			this.score = score;
		}
	}
	
	void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("Score " + score);
	}
}
