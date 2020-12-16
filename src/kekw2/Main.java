package kekw2;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import java.io.*;
/*
Реалізувати колекцію LinkedList, ArrayList (З збільшенням capacity(розмір));
add();
remove();
size();
contains();
Реалізувати клас SerializationUtil з методами серіалізації та десереалізації
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var ll = new LinkedList<Integer>();
        ll.insert(2);
        ll.insert(3);
        ll.insert(11);
        ll.printList();
        var cont = ll.contains(3);
        ll.remove(2);
        ll.printList();






        var al = new MyArrayList<Integer>();
        al.add(1);
        al.add(6);
        al.add(11);

        al.remove(2);
        System.out.print(al.size());
        al.contains(3);

        //////////////////////////////////////////////////////////


        Person person = new Person("mkyong", 40, new BigDecimal(900));

        // object -> file
        ObjectUtils.writeObject(person, new File("person.obj"));

        // file to object
        Person obj = ObjectUtils.readObject(new File("person.obj"));
        System.out.println(obj);
    }
}

