
public abstract class Bird{
	private boolean feather = true;
 private boolean layEggs = true;
 private String name;
 
public boolean getFeather() {
	return feather;
}

public void setFeather(boolean feather) {
	this.feather = feather;
}

public boolean getLayEggs() {
	return layEggs;
}

public void setLayEggs(boolean layEggs) {
	this.layEggs = layEggs;
}
public Bird() {
	
}
public Bird(boolean feather,boolean layEggs) {
	this.feather = feather;
	this.layEggs = layEggs;
}

public abstract boolean fly();
public String toString() {
	return name;
}
}
