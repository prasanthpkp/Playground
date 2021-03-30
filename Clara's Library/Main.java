import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		switch(n) {
		case 1:{
          in.nextLine();
          String detail = in.nextLine();
		String s[] = detail.split("[|]");
		String name = s[0];
		String num = s[1];
		String date = s[2];
			int pt = in.nextInt();
			PaybackCard pc = new PaybackCard(name,num,date,pt);
			System.out.println(pc.toString());
			break;
		}
		case 2:{
          in.nextLine();
          String detail = in.nextLine();
		String s[] = detail.split("[|]");
		String name = s[0];
		String num = s[1];
		String date = s[2];
			int rate = in.nextInt();
			MembershipCard mc = new MembershipCard(name,num,date,rate);
			System.out.println(mc.toString());
			break;
		}
		default: {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		}


	}

}

abstract class Card {
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;
	public Card(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}

class MembershipCard extends Card {
	private int rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return this.getHolderName() + "'s Membership Card Details\n" + "Card Number "+ this.getCardNumber()+"\nMinimum books to borrow "+this.getRating() +"\nDue date to return the book: 10 days from the book taken";
	}
	
}

class PaybackCard extends Card{
	private int pointsEarned;
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	@Override
	public String toString() {
		return this.getHolderName() + "'s Membership Card Details\n" + "Card Number "+ this.getCardNumber() +"\nMinimum books to borrow "+this.getPointsEarned() +"\nDue date to return the book: unlimited";
	}
	
}