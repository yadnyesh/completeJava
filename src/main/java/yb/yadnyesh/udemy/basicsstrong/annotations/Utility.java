package yb.yadnyesh.udemy.basicsstrong.annotations;

public class Utility {

    void doStuff() {
        System.out.println("Stuff no arguments");
    }

    @MostUsed("Python")
    void doStuff(String stuff) {
        System.out.println("Stuffing .... " + stuff);
    }

    void doStuff(int stuff) {
        System.out.println("Stuffing .... " + stuff);
    }
}
