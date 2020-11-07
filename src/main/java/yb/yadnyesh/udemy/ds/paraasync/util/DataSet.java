package yb.yadnyesh.udemy.ds.paraasync.util;

import yb.yadnyesh.udemy.ds.paraasync.domain.checkout.Cart;
import yb.yadnyesh.udemy.ds.paraasync.domain.checkout.CartItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataSet {
    public static List<String> lowerCaseAlphabetList = List.of("a","b","c", "a", "d", "e", "f", "e", "g", "h", "i");

    public static Cart createCart(int noOfItemsInCart) {
        Cart cart = new Cart();
        List<CartItem> cartItemList = new ArrayList<>();
        IntStream.rangeClosed(1, noOfItemsInCart)
                .forEach((index) -> {
                    String cartItem = "CartItem -".concat(index + "");
                    CartItem cartItem1 = new CartItem(index, cartItem, generateRandomPrice(), index, false);
                });
        cart.setCartItemList(cartItemList);
        return cart;
    }

    public static List<String> namesList(){
        return List.of("Bob", "Jamie", "Jill", "Rick");
    }

    public static LinkedList<Integer> generatedIntegerLinkedList(int maxNumber) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        IntStream.rangeClosed(1, maxNumber)
                .boxed()
                .forEach((linkedList::add));
        return linkedList;
    }

    public static Set<Integer> generateIntegerSet(int maxNumber) {
        return IntStream.rangeClosed(1, maxNumber)
                .boxed().collect(Collectors.toSet());
    }

    public static double generateRandomPrice() {
        int min = 50;
        int max = 100;
        return Math.random() * (max - min + 1) + min;
    }

}
