public class Calculator{
    public int sum(int a ,int b){
        return a+b;
    }
    public float sum(float a ,float b){
        return a+b;
    }
    public double sum(double a ,double b){
        return a+b;
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.sum(5, 10));
        System.out.println("Sum of floats: " + calc.sum(5.5f, 10.5f));
        System.out.println("Sum of doubles: " + calc.sum(5.55, 10.55));
    }
}