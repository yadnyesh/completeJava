package yb.yadnyesh.udemy.basicsstrong.annotations;

public class Box<@NonEmpty T> {

    @NonEmpty int size;
    T type;

    public Box(int size, T type) {
        this.size = size;
        this.type = type;
    }

    class NestedBox extends Box<T> {

        public NestedBox(int size, @NonEmpty T type) {
            super(size, type);
        }

    }
}
