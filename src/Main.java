public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        double weight = 94.55;
        double height = 182;
        double bmIndex = service.calculate(height, weight);
        System.out.println("BMI for weight " + weight + "kg");
        System.out.println("and height " + height + "cm");
        System.out.println("Is " + bmIndex + "");


    }
}
