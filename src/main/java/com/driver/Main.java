package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

}
public class Main {

    B objB = new B();
    System.out.println(objB.meth());

    class B extends A{
        String meth(){

            return "Method is overridden in Extended class B";

        }
    }

    System.out.println(objB.meth());
  
}