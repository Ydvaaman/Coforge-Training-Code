
public class School {
    int regNo;
    String name;
    String location;

    public School(){
        System.out.println("default constructor");
        this.regNo=9040323;
        this.name="Mahatma Gandhi Modern School";
        this.location="Uttar Pradesh";
    }
    public School(String location,int regNo){
        this(regNo,"cps",location);
        System.out.println("overloaded constructor with 2 argument");
    }

    public School(int regNo, String name, String location) {
        System.out.println("overloaded constructor with 3 argument");
        this.regNo = regNo;
        this.location = location;
        this.name = name;
    }
    void schoolInfo(){
        System.out.println("\nschool info");
        System.out.println("\nRegNo "+regNo);
        System.out.println("\nname "+name);
        System.out.println("\nlocation "+location);
    }

    public static void main(String[] args) {
        School school[] = new School[3];
        School school1 = new School();
        School school2 = new School("kanpur",5666565);

        int regNo1[] ={56665,544343, 453234};
        String nm[]={"gandhi public school","vps school","dps school"};
        String loc[]={"kolkata","agara","mathura"};

        for(int i=0;i<3;i++){
            school[i] = new School(regNo1[i], nm[i], loc[i]);
        }
        for(School s:school){
            s.schoolInfo();
        }
        school1.schoolInfo();
        school2.schoolInfo();;
    }
}
