
public class Plant {
private int size;
private Color color;
private Type type;
public Plant(int size,String color,String type) throws TypeException, ColorException {
	Color c = colorToStr(color);
	Type t = typeToStr(type);
	this.size = size;
	this.color=c;
	this.type = t;
}
private Color colorToStr(String color) throws ColorException{
	switch(color.toLowerCase()) {
	case "blue":
		return Color.blue;
	case "red":
		return Color.red;
	case "yellow":
		return Color.yellow;
		default: throw new ColorException("Enter right color");
		
	}
}
private Type typeToStr(String type) throws TypeException {
	switch(type.toLowerCase()) {
	case "rose":
		return Type.rose;
	case "chammoline":
		return Type.chammoline;
	case "violet":
		return Type.violet;
		default:throw new TypeException("Enter right type");
	}
}
public String toString() {
	return "Size"+" "+size+" "+"Color"+ " "+color+" Type "+type;
}
}
