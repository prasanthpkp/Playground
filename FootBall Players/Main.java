import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt();
    
    switch(id) {
    case 1: {
    	sc.nextLine();
    	String pname = sc.nextLine();
    	String gname = sc.nextLine();
    	FootballPlayer fp = new FootballPlayer(pname,gname,null);
    	fp.displayFootballPlayerDetails(pname, gname);
    	break;
    }
    case 2: {
    	Long goal = sc.nextLong();
    	FootballPlayer fp = new FootballPlayer(null,null,goal);
    	fp.displayFootballPlayerDetails(goal);
    	break;
    }
    default:{
    	System.out.println("Invalid Input");
    	System.exit(0); }
    }
  }
}

class FootballPlayer{
	private String pname;
	private String gname;
	private Long goal;
	public FootballPlayer(String pname, String gname, Long goal2) {
		super();
		this.pname = pname;
		this.gname = gname;
		this.goal = goal2;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Long getGoal() {
		return goal;
	}
	public void setGoal(Long goal) {
		this.goal = goal;
	}
	public void displayFootballPlayerDetails(String pname, String gname) {
		System.out.println("Player details of the football:");
		System.out.println("Main Player- "+this.getPname());
		System.out.println("GoalKeeper- "+this.getGname());
	}
	public void displayFootballPlayerDetails(Long goal) {
		System.out.println("Number of goals scored in the match: "+this.getGoal());
	}
}