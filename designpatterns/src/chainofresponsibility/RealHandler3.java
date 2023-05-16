package chainofresponsibility;

public class RealHandler3 extends Handler {

	public RealHandler3(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	void handleRequest(Request obj) {
		if(obj.state<0) {
			System.out.println("handler 3");
			
		}
		else if(next!=null) {
			System.out.println("forwarding request");
			next.handleRequest(obj);
		}
	}

}
