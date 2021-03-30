import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    if(num>0){
    String name;
      String color;
    Long age;
    Alien al[] = new Alien[num];
    for(int i=0; i<num; i++){
      sc.nextLine();
      name = sc.nextLine();
      color = sc.nextLine();
      age = sc.nextLong();
      al[i] = new Alien(name, color, age);
      al[i].setName(name);
      al[i].setColor(color);
      al[i].setAge(age);
    }

    for(int i=0; i<num;i++){
      System.out.println("Alien Name: "+al[i].getName());
      System.out.println("Color: "+al[i].getColor());
      System.out.println("LifeSpan: "+al[i].getAge());
    }
    }
    else
      System.out.println("Invalid Input");
  }
}

class Alien{
  private String name;
  private String color;
  private Long age;
  Alien(String name, String color, Long age){
    this.name = name;
    this.color = color;
    this.age = age;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
   public void setColor(String color){
    this.name = name;
  }
  public String getColor(){
    return this.name;
  }
  public void setAge(Long age){
    this.age = age;
  }
  public Long getAge(){
    return this.age;
  }
}