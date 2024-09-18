public class Employee {
    int id;
    String name;
    float salary;

    public static void main(String[] args) {

        Employee employee1;
        employee1 = new Employee();

        System.out.println(employee1.id);
        System.out.println(employee1.name);
        System.out.println(employee1.salary);

        employee1.id = 98876;
        employee1.name = "aman kumar";
        employee1.salary = 5600.00f;

        System.out.println(employee1.id);
        System.out.println(employee1.name);
        System.out.println(employee1.salary);
    }

}
