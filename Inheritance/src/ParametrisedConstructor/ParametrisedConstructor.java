package ParametrisedConstructor;

import java.util.function.Predicate;

class Parent{
    public Parent(){
        System.out.println("Non-Param of parent");
    }
    public Parent(int x){
        System.out.println("Param of Parents "+x);
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Non-Param Child");
    }
    public Child(int y){
        System.out.println("Param Child");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("Two param of child "+y);
    }
}
public class ParametrisedConstructor {
    public static void main(String[] args) {

        Child c = new Child(20,5);

    }
}
