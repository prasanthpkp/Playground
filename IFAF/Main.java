import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String pname = in.nextLine();
		String tname = in.nextLine();
		int mp = in.nextInt();
		int rs = in.nextInt();
		if(mp>0&&rs>0) {
		Player p = new Player(pname,tname,mp,rs);
		System.out.println("Player Details");
		p.displayPlayerStatistics();
		}
		else
			System.out.println("Invalid Input");
	}

}

class Player implements PlayerStatistics{
	private String name;
	private String teamName;
	private int noOfMatches;
	private long totalRunsScored;
	public Player(String name, String teamName, int noOfMatches, long totalRunsScored) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
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
	public long getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(long totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public void displayPlayerStatistics(){
		System.out.println("Player name: "+this.getName());
		System.out.println("Team name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("Total goals: "+this.getTotalRunsScored());
	}
}


interface PlayerStatistics {
	public void displayPlayerStatistics();	
}