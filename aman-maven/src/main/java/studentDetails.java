public class studentDetails {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    studentDetails(int studentId,String studentName,String studentAddress){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT college";
    }

    studentDetails(int studentId,String studentName,String studentAddress,String collegeName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }

    
}
