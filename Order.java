public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode paymentMode;

    //construtor
    public Order(){

    }
    public Order(String item, double unitPrice, int quantity, PaymentMode paymentMode) {

        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.paymentMode = paymentMode;

        double amount = getUnitPrice() * getQuantity();
        double discount = amount * getPaymentMode().determineDiscountRate(amount);
        setTotalAmount(amount - discount);

    }
    //setters
    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    //getters
    public String getItem() {
        return item;
    }
    public int getQuantity() {

        return quantity;
    }
    public double getUnitPrice() {

        return unitPrice;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

}
