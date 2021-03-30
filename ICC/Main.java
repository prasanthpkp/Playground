import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String opt;
		int op = in.nextInt();
		switch(op) {
		case 1:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			int wt = in.nextInt();
			Bowler bw = new Bowler(name,tname,mp,wt);
			bw.displayPlayerStatistics();
			break;
		}
		case 2:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			long rs = in.nextLong();
			Batsman bm = new Batsman(name,tname,mp,rs);
			bm.displayPlayerStatistics();
			break;
		}
		case 3:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			int ct = in.nextInt();
			int st = in.nextInt();
			int dm = in.nextInt();
			long rs = in.nextLong();
			WicketKeeper wk = new WicketKeeper(name,tname,mp,ct,st,rs,dm);
			wk.displayPlayerStatistics();
			break;
		}
		case 4:{
			in.nextLine();
			String name = in.nextLine();
			String tname = in.nextLine();
			int mp = in.nextInt();
			long rs = in.nextLong();
			int wt = in.nextInt();
			AllRounder ar = new AllRounder(name,tname,mp,rs,wt);
			ar.displayPlayerStatistics();
			break;
		}
		default:{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		}
	}

}

interface PlayerStatistics {
	public void displayPlayerStatistics();
}

class CricketPlayer {
	private String name;
	private String teamName;
	private int noOfMatches;
	public CricketPlayer(String name, String teamName, int noOfMatches) {
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

class WicketKeeper extends CricketPlayer implements PlayerStatistics{
	private int noOfCatches, noOfStumpings;
	private long runs;
	private int noOfDismissals;
	public WicketKeeper(String name, String teamName, int noOfMatches, int noOfCatches, int noOfStumpings, long runs,
			int noOfDismissals) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}
	public int getNoOfCatches() {
		return noOfCatches;
	}
	public void setNoOfCatches(int noOfCatches) {
		this.noOfCatches = noOfCatches;
	}
	public int getNoOfStumpings() {
		return noOfStumpings;
	}
	public void setNoOfStumpings(int noOfStumpings) {
		this.noOfStumpings = noOfStumpings;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public int getNoOfDismissals() {
		return noOfDismissals;
	}
	public void setNoOfDismissals(int noOfDismissals) {
		this.noOfDismissals = noOfDismissals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("No of catches: "+this.getNoOfCatches());
		System.out.println("No of stumpings: "+this.getNoOfStumpings());
		System.out.println("No of dismissals: "+this.getNoOfDismissals());
		System.out.println("Total runs scored: "+this.getRuns());
	}
}

class Bowler extends CricketPlayer implements PlayerStatistics {
	private int noOfWickets;

	public Bowler(String name, String teamName, int noOfMatches, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("No of wickets taken: "+this.getNoOfWickets());
	}
}

class Batsman extends CricketPlayer implements PlayerStatistics{
	private long runs;

	public Batsman(String name, String teamName, int noOfMatches, long runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getRuns());
	}
}

class AllRounder extends CricketPlayer implements PlayerStatistics{
	private long runs;
	private int noOfWickets;
	public AllRounder(String name, String teamName, int noOfMatches, long runs, int noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Name: "+this.getName());
		System.out.println("Team Name: "+this.getTeamName());
		System.out.println("No of matches: "+this.getNoOfMatches());
		System.out.println("Total runs scored: "+this.getRuns());
		System.out.println("No of wickets taken: "+this.getNoOfWickets());
	}
}