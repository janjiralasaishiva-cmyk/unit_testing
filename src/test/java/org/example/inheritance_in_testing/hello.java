package org.example.inheritance_in_testing;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



public class hello{

@Nested
    class Parent {
        @Test
        void print(){
            System.out.println("hii from parent");
        }
    }

//class Dummy{
//    @Test
//    void print(){
//        System.out.println("dummy");
//    }
//
//    @Test
//    void println(){
//        System.out.println("More method  from dummy");
//    }
//
//}
@Nested
class Child extends Parent{

     @Test
     void prints(){
         System.out.println("child");
     }


    }



}