package Java.Day_63_Rewiew_01;

public class Developers extends Employee implements DevTeam{

    public String programingLanguage;

    public Developers(String name, int age, char gender, String jobTitle,
                      double salary, int employeeID, String departmant,String programingLanguage) {
        super(name, age, gender, jobTitle, salary, employeeID, departmant);
        this.programingLanguage=programingLanguage;
    }

    @Override
    public void coding() {
        System.out.println("Developers are writing code on IDE");
        System.out.println(getJobTitle()+" "+"is programing"+programingLanguage);
    }

    // @Override--->bunu yazmak zorunda degiliz
    public void test() {
        System.out.println("Developers write unit test");
    }
    public void fixBug(){
        System.out.println(getJobTitle()+" "+"is fixing bug");
    }

}
