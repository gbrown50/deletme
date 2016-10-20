
public class Hello {
    public static void main(String[] args) {

          System.out.println("Hello World");
        int numYears = 10;
        float principal = 10000.00f;
        float intrestRate = 5.0f;

        float amount = (float)(principal * Math.pow((1 + (intrestRate /100.0f)),numYears));

        System.out.println(amount);
        }
        }

