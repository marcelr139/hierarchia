public class Manager extends Employee {
    int teamSize;

    public Manager(String name,double salary,int teamSize){
        super(name, salary);
        this.teamSize=teamSize;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Liczba osob w zespole: "+teamSize);
    }

    public Manager(String name,double salary){
        super(name, salary);
        this.teamSize=0;
    }
}