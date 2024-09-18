public class Product {
    private int productId;
    private String productName;
    private float productCost;

    public Product(int productId,String productName, float productCost){
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        System.out.println("constructor called");
    }
    private static String company_name;

    static {
        company_name = "HUL";
        System.out.println("Static block");
    }
    {
        System.out.println("Non static block/ init block");
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public  String getCompany_name() {
        return company_name;
    }
}
