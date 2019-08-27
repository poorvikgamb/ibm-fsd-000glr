package JunitTrial;

public class GreaterNumber {
	
	int x;
	int y;
	
	
	public GreaterNumber(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int isGreater()
	{
		if(this.x>this.y)
			return 1;
		else
			return 0;
	}
	
	public int isNotGreater()
	{
		if(this.x<this.y)
			return 1;
		else 
			return 0;
	}
	
	

}
