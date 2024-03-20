package bai6;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static Person[] persons;

    static {
        Person person1 = new Person("John", 25, true);
        Person person2 = new Person("Alice", 30, false);
        Person person3 = new Person("Michael", 40, true);
        Person person4 = new Person("Emily", 28, false);
        Person person5 = new Person("David", 35, true);
        Person person6 = new Person("Sophia", 32, false);

        persons = new Person[]{person1, person2, person3, person4, person5, person6};
    }

    public static void main(String[] args) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getAge() > persons[j].getAge()) {
                    Person temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }

        Queue<Person> nam = new PriorityQueue<>();
        Queue<Person> nu = new PriorityQueue<>();
        for (Person item : persons) {
            if (item.isGender()) {
                nam.add(item);
            } else {
                nu.add(item);
            }
        }

        sortAge(nu);
        sortAge(nam);
        System.out.println(nu.toString().concat(nam.toString()));
    }

    static void sortAge(Queue<Person> queue) {
        Person[] arr = queue.toArray(new Person[queue.size()]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getAge() > arr[j].getAge()) {
                    Person temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
