package org.zaverukha.edu;


import java.security.acl.AclNotFoundException;

class A{
    private String message;
    A(){
        this("Empty");

    }

    A(String message){
        this.message = message;

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
        int[] in = new int[2];
        try{
            in[2] =   in[1];
        }catch ( ArrayIndexOutOfBoundsException ex){
            in[1] = 1;
//            error.printStackTrace();
//            System.out.println(error);
        }


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