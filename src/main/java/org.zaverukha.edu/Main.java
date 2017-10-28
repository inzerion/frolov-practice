package org.zaverukha.edu;

class A{
    String message = "Empty";
    A(){


    }

    String getMessage(){ return  this.message; }

    void setMessage(String message){
        this.message = message;

    }


    @Override
    public String toString() {
        return message + super.toString();
    }
}

public class Main {
    static final int MY_NUM = 5;
    public static void main(String[] args) {
        int a = 5;
        Integer b = 6;
        test(a);
        test2(b);
        System.out.println(a);
        System.out.println(b);
        A clazz = new A();
        System.out.println(clazz);
        A clazz2 = new A();
        System.out.println(clazz2);
    }

    static void test(int a){
        a = 8;
        System.out.println(a);

    }

    static void test2(Integer b){
        b = 9;
        System.out.println(b);
    }


    static void test3(A clazz){
        clazz.setMessage("Hello Worlds");
        System.out.println(clazz);
    }


}