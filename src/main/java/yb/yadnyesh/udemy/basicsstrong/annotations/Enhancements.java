package yb.yadnyesh.udemy.basicsstrong.annotations;

public class Enhancements {
    public static void main(String[] args) {
        Box<String> box = new @NonEmpty Box<>(10,"Container");
    }
}
