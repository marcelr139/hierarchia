public class Director extends Manager{
    String department;

    public void displayInfo(){
        super.displayInfo();
        System.out.println("nazwa działu: "+department);
    }

    public Director(String name,double salary,int teamSize,String department){
        super(name, salary, teamSize);
        this.department=department;
    }
}