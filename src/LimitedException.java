public class LimitedException extends Exception {
    private double remainingAmount;
    public LimitedException(String message) {
        super(message);
    }
    public double getRemainingAmount() {
        return remainingAmount;
    }
}
