import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        studentDetails student1 = null;
        System.out.println("Enter student's ID:");
        int id = sc.nextInt();

        System.out.println("Enter student's name:");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Enter student's Address:");
        String address = sc.next();


        boolean flag = true;
        while(flag){
            System.out.println("Whether the student is from NIT(Yes/No):");
            String ch=sc.next();
            if(ch.equals("Yes")){
                student1 = new studentDetails(id,name,address);
                flag = false;
            }else if(ch.equals("No")){
                System.out.println("Enter the college name:");
                String collegeName = sc.next();
                student1= new studentDetails(id, name, address, collegeName);
                flag = false;
                break;
            }else{
                System.out.println("Wrong input");
                flag=true;
            }
        }
        System.out.println("Student id: "+student1.getStudentId());
        System.out.println("Student name: "+student1.getStudentName());
        System.out.println("Student address: "+student1.getStudentAddress());
        System.out.println("Student college: "+student1.getCollegeName());

    }
}
