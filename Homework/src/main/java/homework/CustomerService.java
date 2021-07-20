package homework;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    TreeMap<Customer, String> customers = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        return customers.firstEntry();
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return customers.higherEntry(customer);
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }
}
