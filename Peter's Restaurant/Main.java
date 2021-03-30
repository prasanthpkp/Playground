import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    if(num>0){
      String name;
      int time;
      String location;
      double price;
      Order order[] = new Order[num];
      for(int i=0;i<num;i++){
        sc.nextLine();
        name = sc.nextLine();
        time = sc.nextInt();
        sc.nextLine();
        location = sc.nextLine();
        price = sc.nextDouble();
        order[i] = new Order(name,time,location,price);
      }
      System.out.println("Order details");
      for(int i=0;i<num;i++) {
        System.out.println("Order--"+(i+1));
        System.out.println("Customer name: "+order[i].getName());
      System.out.println("Time takes to deliver: "+order[i].getTime());
      System.out.println("Delivery Location: "+order[i].getLocation());
      System.out.println("Price: "+order[i].getPrice()); }
    }
  else
    System.out.println("Invalid Input");
  }
  }
  
  class Order{
    private String name;
    private int time;
    private String location;
    private double price;
    Order(String name, int time, String location, double price){
      this.name=name;
      this.time=time;
      this.location=location;
      this.price=price;
    }
    
    public void setName(String name){
      this.name = name;
    }
    public void setTime(int time){
      this.time = time;
    }
    public void setLocation(String location){
      this.location = location;
    }
    public void setPrice(double price){
      this.price = price;
    }
    public String getName(){
      return this.name;
    }
    public int getTime(){
      return this.time;
    }
    public String getLocation(){
      return this.location;
    }
    public double getPrice(){
      return this.price;
    }    
    public void displayAllOrderDetails(){
      System.out.println("Customer name: "+this.name);
      System.out.println("Time takes to deliver: "+this.time);
      System.out.println("Delivery Location: "+this.location);
      System.out.println("Price: "+this.price);
    }
  }