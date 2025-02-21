import java.io.*;

class Employee{
    int salary=60000;

    
}

class Engineer extends Employee{
    int benefits=10000;

}
public class inheritance {
    public static void main(String[] args) {

        Engineer E1 =new Engineer();

        System.out.println("salary :" + E1.salary + "\nBenefits :" + E1.benefits);
        
    }
    
}



