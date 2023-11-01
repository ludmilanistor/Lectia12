package Employee;

//import Employee.Employee;

public class Programmer extends Employee {
    public Programmer(String name, int age, String functie) {
        super(name, age, functie);
    }

    @Override
    public void attendTraining() {
        // super.attendTraining();
        System.out.println("Attend Training - " + getName() +", "+ getAge() +" ani, " + getFunctie());
    }
}
