public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public Employee(int id, String firstName, String lastName, int salary){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public String toString(){
    return "Employee name: " + this.firstName + " " + this.lastName + " salary: " + this.salary;

  }
  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public int getAnnualSalary(){
    return this.salary * 12;
  }

  public int  raiseSalary( int percentage){
    System.out.println("old salary" + this.salary);
    System.out.println("percent increase" + percentage);
    int new_salary = this.salary + (this.salary* percentage/100);
    System.out.println("New salary" + new_salary);
    this.salary = new_salary;
    return this.salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
