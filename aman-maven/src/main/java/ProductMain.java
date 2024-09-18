public class ProductMain {
    public static void main(String[] args) {
        Product product= new Product(1001,"Britiania biscuit",40);
        System.out.println("product information:");
        System.out.println("\t id is "+product.getProductId());
        System.out.println("\n name is "+product.getProductName());
        System.out.println("\t cost is "+product.getProductCost());
        System.out.println("\t company name "+product.getCompany_name());
    }
}
