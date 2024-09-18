public class Teacher {
    int id;
    String name;

    void info(){
        System.out.println("\t id "+id);
        System.out.println("\t name "+name);
    }
}

class HighSchoolTeacher extends Teacher{
    int age;
    String location;

   void info() {
        super.info();
        System.out.println("\tage "+age);
        System.out.println("\tlocation "+location);
    }

    public static void main(String[] args) {
        HighSchoolTeacher highSchoolTeacher = new HighSchoolTeacher();
        highSchoolTeacher.id = 1001;
        highSchoolTeacher.name="aman kumar";
        highSchoolTeacher.age=22;
        highSchoolTeacher.location="delhi";

        highSchoolTeacher.info();
    }
}

/*
private
default
protected
public
*/
