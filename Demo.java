package People;

public class Demo {
	public static void main(String[] args) {
		
		Person[] hora = new Person[10];
		Person pesho = new Person("Pesho", 20, true);
		Person dani = new Person("Daniela", 19, false);
		Student ani = new Student("Anna", 21, false, 4.5);
		Student joro = new Student("Georgi", 22, true, 3.5);
		Employee anji = new Employee("Anjela", 20, false, 4.6);
		Employee koko = new Employee("Konstantin", 23, true, 3.9);
		hora[0] = pesho;
		hora[1] = dani;
		hora[2] = ani;
		hora[3] = joro;
		hora[4] = anji;
		hora[5]  = koko;
		for(int i = 0; i < hora.length; i++){
			if(hora[i] != null){
				hora[i].showPersonInfo();
			}
		}
		
		for(int i = 0; i < hora.length; i++){
			if(hora[i] != null){
				if(hora[i].isEmployee()){
					System.out.println(hora[i].name + " makes " + ((Employee) hora[i]).calculateOvertime(2) + " leva for two extra hours");
				}
			}
		}
	}
}
