import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt();
    switch(id) {
    case 1: {
    	sc.nextLine();
    	String date = sc.nextLine();
    	FootballPlayer fp = new FootballPlayer(date,null,null,null);
    	fp.displayFootballPlayerDetailss(date);
    	break;
    }
    case 2: {
    	sc.nextLine();
    	String venue = sc.nextLine();
    	FootballPlayer fp = new FootballPlayer(null,venue,null,null);
    	fp.displayFootballPlayerDetails(venue);
    	break;
    }
    case 3:{
    	sc.nextLine();
    	String team = sc.nextLine();
    	Long goal = sc.nextLong();
    	FootballPlayer fp = new FootballPlayer(null,null,team,goal);
    	fp.displayFootballPlayerDetails(team,goal);
    	break;
    }
    default:{
    	System.out.println("Invalid Input");
    	System.exit(0); }
    }
  }
}

class FootballPlayer{
	private String date;
	private String venue;
	private String team;
	private Long goal;
	public FootballPlayer(String date, String venue, String team, Long goal) {
		super();
		this.date = date;
		this.venue = venue;
		this.team = team;
		this.goal = goal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Long getGoal() {
		return goal;
	}
	public void setGoal(Long goal) {
		this.goal = goal;
	}
	public void displayFootballPlayerDetailss(String date) {
		String temp[] = date.split("/");
		String temp1 = temp[1]+"-"+temp[0]+"-"+temp[2];
		System.out.println("Match Date: "+temp1);
	}
	public void displayFootballPlayerDetails(String venue) {
		String temp[] = venue.split(",");
		System.out.println("Match Venue:");
		System.out.println("Stadium: "+temp[0]);
		System.out.println("Country:"+temp[1]);
	}
	public void displayFootballPlayerDetails(String team, Long goal) {
		System.out.println("Match Outcome: "+this.getTeam()+" won by "+this.getGoal()+" goals");
	}
}