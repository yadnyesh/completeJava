package yb.yadnyesh.udemy.basicsstrong.annotations;


class Parent {
    public void m1() {
        System.out.println("M1 Parent implementation");
    }

    public void m2() {
        System.out.println("M2 Parent implementation");
    }
}


public class GeneralPurpose extends Parent {

    @Override
    public void m1() {
        System.out.println("M1 child implementation");
    }

    public static void main(String[] args) {
        GeneralPurpose generalPurpose = new GeneralPurpose();
        generalPurpose.m1();
        generalPurpose.m2();
        System.out.println("Main method");
    }

}
