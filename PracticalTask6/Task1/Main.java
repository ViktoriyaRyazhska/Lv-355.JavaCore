
public class Main {
public static void main(String[] args) {
	Animal[] animal = {new Cat(),new Cat(),new Cat(), new Dog(),new Dog()};
	for (int i = 0; i < animal.length; i++) {
		animal[i].feed();
		animal[i].voice();
	}
	
}
}
