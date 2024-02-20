public class ShopeePay implements PaymentMode{

    @Override
    public double determineDiscountRate(double amount) {
        return 0.10;  // 10% discount for ShopeePay
    }
}
