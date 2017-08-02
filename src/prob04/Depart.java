package prob04;



public class Depart extends Employee {

	/*
	 * 1. Employee.java 와 Prob04.java클래스는 수정하지 않습니다. 
	 * 2. Depart클래스에 멤버변수를 String department변수외에 추가하지 않습니다. 
	 * 3. Depart클래스에서 생성자를 구현하지 않으면 감점, getInformation()메서드를 구현하지 않으면 감점.
	 * 4. 컴파일이 안되거나 Exception이 발생하는 경우도 무조건 오답으로 처리됩니다.
	 */
	
	private String department;
	
	public Depart()
	{
		
	}
	public Depart(String name, int salary, String department) {
		
		Employee emp = new Employee();
		
		emp.setName(name);
		emp.setSalary(salary);
		this.department = department;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
