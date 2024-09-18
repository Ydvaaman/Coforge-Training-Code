public class Mobile {

    long regNo;
    String model;
    float cost;

    public Mobile() {
        System.out.println("default constructor called");
        this.regNo = 84876452;
        this.model="Samsung";
        this.cost = 55000;
    }
    void mobileInfo(){
        System.out.println("\n\treg no " + regNo);
        System.out.println("\n\tmodel " + model);
        System.out.println("\n\treg no " + cost);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        System.out.println("reg no "+ mobile.regNo);
        System.out.println("model "+ mobile.model);
        System.out.println("cost "+ mobile.cost);
    }
}
