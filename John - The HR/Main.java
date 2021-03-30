import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    if(num>0){
    String name;
    Long salary;
    Salary salcon[] = new Salary[num];
    for(int i=0; i<num; i++){
      sc.nextLine();
      name = sc.nextLine();
      salary = sc.nextLong();
      salcon[i] = new Salary();
      salcon[i].setName(name);
      salcon[i].setSalary(salary);
    }
    
    System.out.println("View Employee's Salary Confidential details");
    for(int i=0; i<num;i++){
      System.out.println("Name of the Employee: "+salcon[i].getName());
      System.out.println("Salary of "+salcon[i].getName()+": "+salcon[i].getSalary());
    }
    }
    else
      System.out.println("Invalid Input");
  }
}

class Salary{
  private String name;
  private Long salary;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setSalary(Long salary){
    this.salary = salary;
  }
  public Long getSalary(){
    return this.salary;
  }
}