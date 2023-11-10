import java.util.*;

import static java.util.random.RandomGeneratorFactory.all;

public class Main {
    public static void main(String args[]) {
        TreeSet<String> person = new TreeSet<String >();
        person.add("Alex");
        person.add("Ion");
        person.add("Vlad");
        person.add("Vadim");
        person.add("Cristian");


        Iterator<String> itr = person.iterator();
        while (itr.hasNext()) {
            System.out.println("Person = " + itr.next());
        }
    }
}
