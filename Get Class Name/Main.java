import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String code = sc.nextLine();
    String project = sc.nextLine();
    Developer dev = new Developer(code,project);
		System.out.println("Developer Details");
		System.out.print(dev.toString());

  }
}

class Developer {
	private String code;
	private String project;
    Developer(String p, String q) {
		setCode(p);
		setProject(q);
	}
	public void setCode(String x) {
		this.code = x;
	}
	public void setProject(String y) {
		this.project = y;
	}
	public String getCode() {
		return code;
	}
	public String getProject() {
		return project;
	}
	public String toString() {
	    return (getClass()+" "+"["+this.getCode()+" --- "+this.getProject()+"]");
	}
}