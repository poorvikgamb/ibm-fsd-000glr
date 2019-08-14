package comm.first;

public class InnerClass {
	
	public InnerClass() {
		System.out.println("outside class");
	}
	
	public void InnerFunction() {
		System.out.println("tetsing outside class");
	}

	public class In{
		public In() {
			System.out.println("inside inner class");
		}
		
		public void InFunctionn() {
			System.out.println("tetsing inner class");
		}

	}
}
