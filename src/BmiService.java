public class BmiService {
    public double calculate(double height, double weight) {
        double bmIndex = (int) (weight / (height * height / 100 / 100));
        return (bmIndex);
    }


}
