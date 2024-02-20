public class GCash implements PaymentMode{
    @Override
    public double determineDiscountRate(double amount) {
        return 0.0;  // No discount for GCash
    }
}
