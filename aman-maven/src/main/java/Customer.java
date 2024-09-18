public class Customer {
    private int cutomerId;
    private String customerName;
    String emailId;

    public int getCutomerId() {
        return cutomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Customer(int cutomerId, String emailId, String customerName) {
        this.cutomerId = cutomerId;
        this.emailId = emailId;
        this.customerName = customerName;
    }
}