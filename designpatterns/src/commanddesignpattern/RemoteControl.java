package commanddesignpattern;

public class RemoteControl {
	Command b1command;
	Command b2command;
	Command b3command;
	Command b4command;
	public void btn1() {
		if(b1command==null) {
			return;
		}
		b1command.undo();
		
	}
    public void btn2() {
    	if(b2command==null) {
			return;
		}
		b2command.execute();
		
		
	}
    public void btn3() {
    	if(b3command==null) {
			return;
		}
		b3command.execute();
		
	
    }
    public void btn4() {
    	b1command.execute();
    	if(b4command==null) {
			return;
		}
		b4command.execute();
		
	
    }

}
