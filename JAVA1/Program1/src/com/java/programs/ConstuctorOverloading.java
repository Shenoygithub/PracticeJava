package com.java.programs;

public class ConstuctorOverloading {
    int id;
    String name;
    int age;
    ConstuctorOverloading(int i, String n)
    {
        id = i;
        name = n;
    }
    ConstuctorOverloading(int i, String n, int a){
        id =i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Student id, name and age are respectively\n"+id+name+age);
    }
    public static void main(String[] args) {
        ConstuctorOverloading c1 = new ConstuctorOverloading(111, "Raks", 15);
        ConstuctorOverloading c2 = new ConstuctorOverloading(222, "Nams", 20);
        ConstuctorOverloading c3 = new ConstuctorOverloading(333, "Vaishu", 12);

        c1.display();
        c2.display();
        c3.display();
    }

}
