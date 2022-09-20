package com.java.programs;

class Practice {
 int id;
 String name;
 static String college_Name = "Canara";

 Practice(int i, String n) {
  id = i;
  name = n;
 }
 void display(){
  System.out.println("Student rollno. is\n"+id+"\nStudent name is\n"+name+"\ncollege name is\n"+college_Name);
 }
 public static void main(String[] args){
  Practice p1 = new Practice(11,"Ram");
  Practice p2 = new Practice(12,"Sham");
  p1.display();
  p2.display();
 }
}
