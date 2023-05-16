package decorater;

public class Test {

	public static void main(String[] args) {
		Shape cr=new Circle();
		Shape tr=new Triangle();
		ShapeDecorater sd=new BorderShape(tr);
		//cr.draw();
		//sd.draw();
		ShapeDecorater cd=new ColorShape(sd);
		cd.draw();
		
		// TODO Auto-generated method stub

	}

}
