public class PaymentApp {

    public static void main(String[] args){

        Order order = new Order("keyboard", 300.0, 10, new GCash());
        System.out.println("\nOrder item is "+order.getItem());
        System.out.println("Unit price is "+order.getUnitPrice());
        System.out.println("Quantity is "+order.getQuantity());

        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount is "+order.getPaymentMode().determineDiscountRate(order.getTotalAmount()));
        System.out.println("Payment amount is " +order.getTotalAmount());

        order = new Order("keyboard", 300.0, 10, new Maya());
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount is "+order.getPaymentMode().determineDiscountRate(order.getTotalAmount()));
        System.out.println("Payment amount is " +order.getTotalAmount());

        order = new Order("keyboard", 300.0, 10, new ShopeePay());
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount is "+order.getPaymentMode().determineDiscountRate(order.getTotalAmount()));
        System.out.println("Payment amount is " +order.getTotalAmount());

    }
}
