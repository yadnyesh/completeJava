package yb.yadnyesh.udemy.basicsstrong.reactive;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObserver {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Orange","Black","Red");
        source.subscribe(e -> System.out.println(e), Throwable::printStackTrace, () -> System.out.println("Completed"));

        source.subscribe(e -> System.out.println(e), Throwable::printStackTrace);

        source.subscribe(e -> System.out.println(e));

    }
}
