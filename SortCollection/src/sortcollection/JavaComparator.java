package sortcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Trinh Dinh Phuong
 * @web: https://trinhdinhphuong.com
 */
public class JavaComparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, "Trinh Dinh Phuong A", 20));
        persons.add(new Person(5, "Trinh Dinh Phuong G", 20));
        persons.add(new Person(3, "Trinh Dinh Phuong C", 20));
        persons.add(new Person(4, "Trinh Dinh Phuong S", 20));
        persons.add(new Person(2, "Trinh Dinh Phuong T", 20));
        persons.add(new Person(6, "Trinh Dinh Phuong B", 20));
        
        System.out.println("List of persons before sorting Java: ");
        persons.forEach( p -> {
            System.out.println(p.getId() + " " + p.getName() + " " +  p.getAge());
        });
        
        Collections.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        
        });
        
        System.out.println("List of persons after sorting Java: ");
        persons.forEach( p -> {
            System.out.println(p.getId() + " " + p.getName() + " " +  p.getAge());
        });
    }
}
