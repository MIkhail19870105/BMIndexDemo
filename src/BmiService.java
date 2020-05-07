public class BmiService {
    public double calculate(double height, double weight) {
        double bmIndex = (int) (weight / Math.pow(height / 100, 2));
        return (bmIndex);
    }


}
