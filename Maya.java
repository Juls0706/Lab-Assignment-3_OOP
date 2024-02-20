public class Maya implements PaymentMode{

    @Override
    public double determineDiscountRate(double amount) {
        return 0.05; // 5% discount for Maya
    }
}
