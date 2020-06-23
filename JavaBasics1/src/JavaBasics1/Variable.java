package JavaBasics1;
class Employee{
	int a;
	static int id=204;
	void change() {
		System.out.println(id);
	}
}
public class Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.change();
		Employee.id=408;
		emp2.change();
	}

}
