public class Consumer {
    private int consumerId;
    private String consumerName;
    private String consumerType;
    private String consumerLocation;

    public Consumer(int consumerId, String consumerLocation, String consumerType, String consumerName) {
        this.consumerId = consumerId;
        this.consumerLocation = consumerLocation;
        this.consumerType = consumerType;
        this.consumerName = consumerName;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public String getConsumerLocation() {
        return consumerLocation;
    }

    public String getConsumerType() {
        return consumerType;
    }

    public String getConsumerName() {
        return consumerName;
    }
}
