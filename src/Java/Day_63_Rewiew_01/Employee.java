package Java.Day_63_Rewiew_01;

public class Employee extends Person {
    private String jobTitle;
    private double salary;
    private int employeeID;
    private String departmant;



    public Employee(String name, int age, char gender,String jobTitle,double salary,
                    int employeeID,String departmant) {
        super(name, age, gender);
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
        this.setEmployeeID(employeeID);
        this.setDepartmant(departmant);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try {
            this.salary = salary;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", departmant='" + departmant + '\'' +
                '}';
    }
}
