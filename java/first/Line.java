package comm.first;

public class Line extends Model {

	private int StartPoint ;
	private int EndPoint;
	@Override
	public boolean isGreater(Object obj1,Object obj2) {
		
		return false;
	}

	public int getStartPoint() {
		return StartPoint;
	}

	public void setStartPoint(int startPoint) {
		StartPoint = startPoint;
	}

	public int getEndPoint() {
		return EndPoint;
	}

	public void setEndPoint(int endPoint) {
		EndPoint = endPoint;
	}

	public Line(int startPoint, int endPoint) {
		super();
		StartPoint = startPoint;
		EndPoint = endPoint;
	}

	public Line() {
		super();
	}

	@Override
	public boolean isLess(Object obj1,Object obj2) {
		
		return false;
	}

	@Override
	public boolean isEqual(Object obj1,Object obj2) {
		
		return false;
	}

	
}
