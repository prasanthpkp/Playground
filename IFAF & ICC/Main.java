import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int op = in.nextInt();
		
		switch(op) {
		case 1:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			long rs = in.nextLong();
			int wt = in.nextInt();
			CricketPlayer cp = new CricketPlayer(name,tname,mp,rs,wt);
			System.out.println("Player Details");
			cp.displayPlayerStatistics();
			break;
		}
		case 2:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			in.nextLine();
			int gt = in.nextInt();
			HockeyPlayer hp = new HockeyPlayer(name,tname,mp,gt);
			System.out.println("Player Details");
			hp.displayPlayerStatistics();
			break;
		}
		default:{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		}
	}

}

abstract class Player {
	protected String name;
	protected String teamName;
	protected int noOfMatches;
	public Player(String name, String teamName, int noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	
}


interface PlayerStatistics {
	public void displayPlayerStatistics();
}


class CricketPlayer extends Player implements PlayerStatistics{
	private long totalRunsScored;
	private int noOfWicketsTaken;
	public CricketPlayer(String name, String teamName, int noOfMatches, long totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public long getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(long totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}
	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches played: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getTotalRunsScored());
		System.out.println("No of wickets taken: "+this.getNoOfWicketsTaken());
	}
}


class HockeyPlayer extends Player implements PlayerStatistics {
	private int noOfGoals;
	public HockeyPlayer(String name, String teamName, int noOfMatches, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.noOfGoals = noOfGoals;
	}
	public int getNoOfGoals() {
		return noOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches played: "+this.getNoOfMatches());
		System.out.println("Total goals scored: "+this.getNoOfGoals());
	}
}