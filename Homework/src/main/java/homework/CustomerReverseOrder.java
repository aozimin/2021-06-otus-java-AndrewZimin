package homework;


import java.util.ArrayDeque;
import java.util.Deque;

public class CustomerReverseOrder {

    private final Deque<Customer> items = new ArrayDeque<>();

    public void add(Customer customer) {
        items.add(customer);
    }

    public Customer take() {
        return items.pollLast();
    }
}
