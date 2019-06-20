package com.xiaozhi.designMode.simplefactory;

public class ShapeFactory {
	//工厂类可以是单例的，getShape 可以是静态的
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("TRIANGLE")){
	       return new Triangle();
	    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	       return new Rectangle();
	    }
	    return null;
	}
}
