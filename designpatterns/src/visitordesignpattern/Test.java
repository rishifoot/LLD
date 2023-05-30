package visitordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Shape> li=new ArrayList();
		Circle cir=new Circle();
		Triangle tr=new Triangle();
		Rectangle rec=new Rectangle();
		li.add(tr);
		li.add(cir);
		li.add(rec);
		Visitor v=new ExportToSvg();
		for(Shape shape:li) {
			shape.draw();
			shape.accept(v);
		}
	}
}
