package kekw2;

import java.io.*;
import java.math.BigDecimal;

public class Person implements Serializable {

    // optional, if missing, JVM will create it.
    // better declare as a version control.
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient BigDecimal salary;

    Person(String name, int age, BigDecimal salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
