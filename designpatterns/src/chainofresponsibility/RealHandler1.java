package chainofresponsibility;

public class RealHandler1 extends Handler {

	public RealHandler1(Handler next) {
		super(next);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	void handleRequest(Request obj) {
		// TODO Auto-generated method stub
		if(obj.state>0) {
			System.out.println("handler 1");
			
		}
		else if(next!=null) {
			System.out.println("forwarding request");
			next.handleRequest(obj);
			
		}
		
	}

}
