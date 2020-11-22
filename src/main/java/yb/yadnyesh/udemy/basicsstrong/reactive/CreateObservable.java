package yb.yadnyesh.udemy.basicsstrong.reactive;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import java.util.List;

public class CreateObservable {

    public static void main(String[] args) {
        Observable<Integer> source = Observable.create(
                e -> {
                 e.onNext(10);
                 e.onNext(11);
                 e.onNext(12);
                 e.onNext(13);
                 e.onComplete();
                });

        source.subscribe(System.out::println);

        Observable<Integer> just = Observable.just(1,2,3);
        just.subscribe(System.out::println);

        List<String> stringList = List.of("Ram","Shyam","RadheShyam","Mathura");

        Observable<String> fromIterable = Observable.fromIterable(stringList);
        fromIterable.subscribe(System.out::println);

        Observable.range(3, 10).subscribe(System.out::println);
    }

}
