import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int op = in.nextInt();
		
		switch(op) {
		case 1:{
          int cs = in.nextInt();
		float co = in.nextFloat();
		int ts = in.nextInt();
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			ODImatch m = new ODImatch(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m.calculateRunrate(),m.calculateBalls());
			c.display(m.calculateRunrate(),m.calculateBalls());
			break;
		}
		case 2:{
          int cs = in.nextInt();
		float co = in.nextFloat();
		int ts = in.nextInt();
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			T20match m1 = new T20match(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m1.calculateRunrate(),m1.calculateBalls());
			c.display(m1.calculateRunrate(),m1.calculateBalls());
			break;
			
		}
		case 3:{
          int cs = in.nextInt();
		float co = in.nextFloat();
		int ts = in.nextInt();
			System.out.println("Requirements:");
			Match c = new ODImatch(cs,co,ts);
			TestMatch m2 = new TestMatch(cs,co,ts);
			System.out.printf("Need %.0f Runs in %d balls",m2.calculateRunrate(),m2.calculateBalls());
			c.display(m2.calculateRunrate(),m2.calculateBalls());
			break;
			
		}
		default: {
          System.out.println("Invalid Input");
          System.exit(0); }
		}


	}

}


abstract class Match {
	protected int currentScore;
	protected float currentOver;
	protected int target;
	public Match(int currentScore, float currentOver, int target) {
		super();
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.target = target;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public void display(double reqRunrate, int balls) {
		System.out.printf("\nRequired Run Rate- %.2f" ,(reqRunrate/(balls/6)));
	}
}


class ODImatch extends Match{
	public ODImatch(int currentScore, float currentOver, int target){
		super(currentScore,currentOver,target);
	}
	public float calculateRunrate() {
		float need = this.target - this.currentScore;
		return need;
	}
	public int calculateBalls() {
		int a = (int)(50 - this.currentOver)*6;
		return a;
	}
}


class T20match extends Match {
	public T20match(int currentScore, float currentOver, int target){
		super(currentScore,currentOver,target);
	}
	public float calculateRunrate() {
		float need = this.target - this.currentScore;
		return need;
	}
	public int calculateBalls() {
		int a = (int)(20 - this.currentOver)*6;
		return a;
	}
}


class TestMatch extends Match {
	public TestMatch(int currentScore, float currentOver, int target){
		super(currentScore,currentOver,target);
	}
	public float calculateRunrate() {
		float need = this.target - this.currentScore;
		return need;
	}
	public int calculateBalls() {
		int a = (int)(90 - this.currentOver)*6;
		return a;
	}
}