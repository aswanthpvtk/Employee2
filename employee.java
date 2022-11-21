import java.util.ArrayList;
import java.util.Scanner;

public class employee {

    int ecode;
    String name;
    String designation;
    int salary;
    String cname;
    String ph;
    String email;


    public employee(int ecode, String name, String designation, int salary, String cname, String ph, String email) {
        this.ecode = ecode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.cname = cname;
        this.ph = ph;
        this.email = email;
    }


    public int getEcode() {
        return ecode;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public String getCname() {
        return cname;
    }

    public String getPh() {
        return ph;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        int op;
        boolean fla=true;
        ArrayList<employee> arr=new ArrayList<employee>();

        System.out.println("Enter the option:");
        System.out.println("--------------------------------------------");
        System.out.println("1.Add\n2.View\n3.Search\n4.Delete\n5.Exit");
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();

        switch(op)
        {
            case 1:
                System.out.println("Enter the emp code");
                int ecode = sc.nextInt();
                System.out.println("Enter the name");
                String name = sc.next();
                System.out.println("enter the designation");
                String designation = sc.next();
                System.out.println("enter the salary");
                int salary = sc.nextInt();
                System.out.println("enter the company name");
                String cname = sc.next();
                System.out.println("enter phone number");
                String ph = sc.next();
                System.out.println("enter email id");
                String email = sc.next();
                employee e = new employee(ecode, name, designation, salary, cname, ph, email);
                arr.add(e);
                break;

        }

    }
}