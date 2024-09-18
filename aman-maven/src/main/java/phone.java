public interface phone {

    public abstract void call();

    String country="India";

}

interface plainMobile{

    void call();

    void sms();

}

interface smartphone{

    void call();

    void sms();

    void videoPlay();

    void audioPlay();

    void internetSurfing();

    void internetBanking();

}

abstract class Myphone{

    private int id;

    private String model;

    private float cost;

    abstract void phoneinfo();

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getModel() {

        return model;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public float getCost() {

        return cost;

    }

    public void setCost(float cost) {

        this.cost = cost;

    }

}

class mysmartphone extends Myphone implements smartphone, phone, plainMobile{

    @Override

    void phoneinfo() {

        System.out.println("Phone info");

        System.out.println("\tid:"+getId());

        System.out.println("\tmodel:"+getModel());

        System.out.println("\tcost:"+getCost());

    }

    @Override

    public void call(){

        System.out.println("Call");

    }

    @Override

    public void sms(){

        System.out.println("SMS");

    }

    @Override

    public void videoPlay(){

        System.out.println("Video Play");

    }

    @Override

    public void audioPlay(){

        System.out.println("Audio Play");

    }

    @Override

    public void internetSurfing(){

        System.out.println("Internet Surfing");

    }

    @Override

    public void internetBanking(){

        System.out.println("Internet Banking");

    }

}

class MySmartPhoneMain{

    public static void main(String[] args) {

        mysmartphone msphone = new mysmartphone();

        msphone.setId(5454545);

        msphone.setModel("Smartphone");

        msphone.setCost(45000);

        System.out.println("My Phone Information");

        msphone.phoneinfo();

        System.out.println("Country name"+phone.country);

        msphone.call();

        msphone.sms();

        msphone.audioPlay();

        msphone.internetSurfing();

        msphone.internetBanking();

        msphone.videoPlay();

    }

}

