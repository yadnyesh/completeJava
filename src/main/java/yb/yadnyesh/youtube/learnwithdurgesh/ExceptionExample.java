package yb.yadnyesh.youtube.learnwithdurgesh;

public class ExceptionExample {

    public static void main(String[] args) {
        int result = 0;

        try {
            System.out.println("Program started");
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("Thanks for the two numbers: " + n1 + " and " + n2);
            result = (int) n1 / n2;
            System.out.println("Division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid Numbers");
            System.out.println(e.getMessage());
            e.getStackTrace();
        } finally {
            System.out.println("Will get to this either ways");
        }
    }
}