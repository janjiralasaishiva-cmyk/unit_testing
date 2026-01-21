package org.example.inheritance_in_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Parent {
    @Test
    void print(){
        System.out.println("Parent method");
    }

//    @BeforeEach
//    void demo(){
//        System.out.println("Demoooooo");
//    }

//    @Test
//    void print11(){
//        System.out.println("print2");
//    }

}

class Child extends Parent{
//    @Test
//    void prints(){
//        System.out.println("Child method");
//    }

//    @Test
    void print(){
        System.out.println("Overriding");
    }
}
