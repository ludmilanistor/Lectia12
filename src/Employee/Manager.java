package Employee;

//import Employee.Employee;

public class Manager extends Employee implements Interview{

   public Manager (String name, int age, String functie) {
        super(name,age,functie);
    }
    @Override
    public void attendTraining() {
       // super.attendTraining();
        System.out.println("Attend Training - " + getName() +", "+ getAge() +" ani, " + getFunctie());
    }

    @Override
    public void conductInterview() {
        System.out.println("Manager - interviewer" + getName());
    }
}
