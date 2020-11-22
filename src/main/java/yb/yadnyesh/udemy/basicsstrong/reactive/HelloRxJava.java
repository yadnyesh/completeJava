package yb.yadnyesh.udemy.basicsstrong.reactive;

import rx.Observable;

public class HelloRxJava {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(e -> {
            e.onNext("Hello");
            e.onNext("RxJava");
        });
        source.subscribe(e -> System.out.println(e));
        source.subscribe(e -> System.out.println("Observer 2: " + e));
    }
}

