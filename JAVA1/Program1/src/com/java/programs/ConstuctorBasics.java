package com.java.programs;

public class ConstuctorBasics {
    //Default Constructor hence using default values
        int id;
        String name;

        void display()
        {
            System.out.println("Student id is"+ id +   "Student name is"+name);
        }

        public static void main(String[] args)

        {
            ConstuctorBasics c1 = new ConstuctorBasics();
            c1.display();
        }
    }


