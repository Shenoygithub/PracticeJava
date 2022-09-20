package com.java.programs;

public class ParametrizedConstructor {
    int id;
    String name;
    ParametrizedConstructor(int i, String n) {//passing parameters using parametrized constructor
        id = i;
        name = n;
    }
        void display(){
            System.out.println("Student rollno is"+id+"Student name is"+name);
        }
        public static void main(String[] args){
            ParametrizedConstructor s1 = new ParametrizedConstructor(111, "Vaishu");
            ParametrizedConstructor s2 = new ParametrizedConstructor(222, "Pinks");

            s1.display();
            s2.display();

        }

}
