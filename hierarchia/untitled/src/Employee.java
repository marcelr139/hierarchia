public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }

    public void displayInfo(){
        System.out.println("Pracownik: "+name+", Wynagrodzenie: "+salary);
    }

}
