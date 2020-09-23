package yb.yadnyesh.sample;

public class MathHelper {

    static int factorial(int i) {
        if ( i < 0) {
            throw new IllegalArgumentException("Only positive numbers supported");
        }
        if(i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i -1);
    }
}
