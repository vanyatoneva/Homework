package People;

public class Person {
	final String name;
	int age;
	final boolean isMale;
	
	Person(String name, int age, boolean isMale){
		if(name!= null && !name.equals("") && !name.equals(" ")){
			this.name = name;
		}
		else{
			this.name = this.toString();
		}
		if(age > 0 ){
			this.age = age; 
		}
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println(name + " is " + (isMale ? "male" : "female"));
	}
	
}
