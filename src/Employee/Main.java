package Employee;
//import Employee.Manager;
//import Employee.MeetingRoom;
//import Employee.Programmer;
//import Employee.Training;
public class Main {
    public static void main(String[] args) {

        Training t1 = new Programmer("Andrei", 32, "programator");
        Training t2 = new Manager("Vasile",34, "manager");
        Training t3 = new Programmer("Ilie",35, "programator");
        Training t4 = new Manager("Ion",42,"manager");

        MeetingRoom meetingRoom = new MeetingRoom();
        meetingRoom.join(new Training[]{t1,t2,t3,t4});

    }
}