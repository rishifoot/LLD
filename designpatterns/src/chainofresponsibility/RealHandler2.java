package chainofresponsibility;

public class RealHandler2 extends Handler{

	public RealHandler2(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	void handleRequest(Request obj) {
		// TODO Auto-generated method stub
		if(obj.state==0) {
			System.out.println("handler 2");
			
		}
		else if(next!=null) {
			next.handleRequest(obj);
		}
		
	}

}
