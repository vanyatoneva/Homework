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
		else{
			age =0;
		}
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println(name + " is " + (isMale ? "male" : "female"));
	}
	
	boolean isStudent(){
		return this instanceof Student ? true : false;
	}
	
	boolean isEmployee(){
		return this instanceof Employee ? true : false;
	}
	protected Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
