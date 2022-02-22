package com.company;

public class Main {

    public static void main(String[] args) {
     Student n1= new Student(" Sayana " , 95);
        System.out.println(n1.getName());
        System.out.println(n1.getResult());
        Student n2= new Student(" Goutham ", 95);
        System.out.println(n2.getName());
        System.out.println(n2.getResult());
    }
}



class Student{
  private String name;
  private int result;

  public Student( String name, int result){
      this.name=name;
      this.result=result;
  }

  public String getName() { return name; }
    public void setName(String name) { this.name=name; }
    public int getResult() { return result; }
    public void setResult(int result) { this.result=result;}


}