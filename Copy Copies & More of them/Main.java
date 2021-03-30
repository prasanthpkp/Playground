import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int id = sc.nextInt();
    switch(id) {
    case 1: {
    	sc.nextLine();
    	String bookName = sc.nextLine();
    	int pages = sc.nextInt();
    	sc.nextLine();
    	String needSpiral = sc.nextLine();
    	boolean temp;
    	if(needSpiral.equalsIgnoreCase("Yes"))
    		temp = true;
    	else
    		temp = false;
    	Xerox nx = new NormalXerox (bookName, pages, temp);
    	System.out.println("Xerox total price is: "+nx.getRatePerPage());
    	break;
    }
    case 2: {
    	sc.nextLine();
    	String bookName = sc.nextLine();
    	int pages = sc.nextInt();
    	sc.nextLine();
    	String needSpiral = sc.nextLine();
    	boolean temp;
    	if(needSpiral.equalsIgnoreCase("Yes"))
    		temp = true;
    	else
    		temp = false;
		Xerox cx = new ColorXerox (bookName, pages, temp);
    	System.out.println("Xerox total price is: "+cx.getRatePerPage());
    	break;
    }
    default:{
    	System.out.println("Invalid Input");
    	System.exit(0); }
    }
  }
}

class Xerox{
	protected String bookName;
	protected int pages;
	protected boolean needSpiral;
	public Xerox(String bookName, int pages, boolean temp) {
		super();
		this.bookName = bookName;
		this.pages = pages;
		this.needSpiral = temp;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public boolean getNeedSpiral() {
		return needSpiral;
	}
	public void setNeedSpiral(boolean needSpiral) {
		this.needSpiral = needSpiral;
	}
	public int getRatePerPage() {
		return 0;
	}
}

class NormalXerox extends Xerox{
	private int ratePerPage;

	public NormalXerox(String bookName, int pages, boolean temp) {
		super(bookName, pages, temp);
		this.ratePerPage = 2;
	}
	
	public int getRatePerPage() {
		if(this.getNeedSpiral()) {
			return (this.getPages()*this.ratePerPage) + 15;
		}
		else
			return this.getPages()*this.ratePerPage;
	}
}

class ColorXerox extends Xerox{
	private int ratePerPage;

	public ColorXerox(String bookName, int pages, boolean needSpiral) {
		super(bookName, pages, needSpiral);
		this.ratePerPage = 5;
	}
	
	public int getRatePerPage() {
		if(this.getNeedSpiral()) {
			return (this.getPages()*this.ratePerPage) + 15;
		}
		else
			return this.getPages()*this.ratePerPage;
	}
}