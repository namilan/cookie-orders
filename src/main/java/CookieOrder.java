
public class CookieOrder {

	private int numBoxes;
	private String variety;

	public String getVariety() {
		return variety;
	}
	public int getNumBoxes() {
		return numBoxes;
	}
	
	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}


}
