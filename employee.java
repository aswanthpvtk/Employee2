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
    static  employee w;
    public static void main(String[] args) {
        int op;
        boolean fl=true;

        while (fl)
        {
            ArrayList<employee> arr = new ArrayList<employee>();

            System.out.println("Enter the option:");

            while (true) {
                System.out.println("--------------------------------------------");
                System.out.println("1.Add\n2.View\n3.Search\n4.Delete\n5.Exit");
                Scanner sc = new Scanner(System.in);
                op = sc.nextInt();

                switch (op)
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

                    case 2:
                        System.out.println("The details are:");
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println("employee details");
                            System.out.println("Id:" + arr.get(i).ecode);
                            System.out.println("name:" + arr.get(i).name);
                            System.out.println("designation:" + arr.get(i).designation);
                            System.out.println("salary:" + arr.get(i).salary);
                            System.out.println("company:" + arr.get(i).cname);
                            System.out.println("number:" + arr.get(i).ph);
                            System.out.println("email:" + arr.get(i).email);

                        }
                        break;

                    case 3:
                        System.out.println("enter the emp code to be search");
                        Scanner sca = new Scanner(System.in);
                        int ecod = sca.nextInt();
                        for (employee e1 : arr) {
                            if (ecod == e1.ecode) {
                                System.out.println("Details of employee with employee code " + ecod + "is ");
                                System.out.println("id:" + e1.ecode);
                                System.out.println("name" + e1.name);
                                System.out.println("designation" + e1.designation);
                                System.out.println("salary" + e1.salary);
                                System.out.println("company" + e1.cname);
                                System.out.println("phone" + e1.ph);
                                System.out.println("email" + e1.email);

                            } else {
                                System.out.println("No such employee found");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Enter the employee code");
                        Scanner obj2 = new Scanner(System.in);
                        int ecode2 = obj2.nextInt();
                        for (employee i : arr) {
                            if (ecode2 == i.ecode) {
                                w = i;
                            }
                        }
                        arr.remove(w);
                        break;

                    case 5:
                        fl = false;
                        break;
                }
                break;
            }

        }
    }
}