package DogTask;

public class Main {

	public static void main(String[] args) {
		Dog rex = new Dog("Rex", 5, Breed.IBIZANHOUND);
		Dog muhtar = new Dog("Muhtar", 8, Breed.AKITA);
		Dog ucha = new Dog("Ucha", 3, Breed.GERMANSPITZ);
		
	if(rex.name.equals(muhtar)) {
		System.out.println("First and second dogs have the same name");
		
	}
	if (rex.name.equals(ucha)) {
		System.out.println("First and 3rd dogs have the same name");
	}
	if (muhtar.name.equals(ucha)) {
		System.out.println("2nd and 3rd dogs have the same name ");
	}
	else {
		System.out.println("No dogs with same names");
		if (rex.getAge() > muhtar.getAge() && rex.getAge() > ucha.getAge()) {
			System.out.println(rex.toString());
		}
		if (muhtar.getAge() > rex.getAge() && muhtar.getAge() > ucha.getAge()) {
			System.out.println(muhtar.toString());
		}
		else {
			System.out.println(ucha.toString());
		}
	}
			
	}

	

}




