package HomeWork4;

public class Dog {

	String name;
	int age;
	Breed type;
	String por;

	public Dog() {

	}

	public Dog(String name, int age, String por) {
		this.name = name;
		this.age = age;
		this.por = por;
		switch (por) {
		case "Big":
			type = Breed.COLLIE;
			break;
		case "Midle":
			type = Breed.BOXER;
			break;
		case "Small":
			type = Breed.BULLDOG;
			break;

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPor() {
		return por;
	}

	public void setType(String por) {
		this.por = por;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Dog[] var = new Dog[3];
		var[0] = new Dog("Тузік", 1, "Big");
		var[1] = new Dog("Тузік", 12, "Small");
		var[2] = new Dog("Кабанчик", 3, "Midle");
		compare (var);
		for (int i = 0; i < var.length; i++) {
			System.out.println(var[i]);
		}
	}

	public static void names(Dog[] k) {
		if (k[0].getName().equals(k[1].getName())) {
			System.out.println(k[0]);
		} else if (k[1].getName().equals(k[2].getName())) {
			System.out.println(k[1]);
		}
	}

	public static void compare(Dog[] k) {
		Dog per;

		for (int i = 0; i < k.length - 1; i++) {

			for (int j = i + 1; j < k.length; j++) {

				if (k[i].getAge() < k[j].getAge()) {

					per = k[i];

					k[i] = k[j];

					k[j] = per;
				}
			}
		}
	}

}

//		if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
//			System.out.println(d1);
//		} else if (d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
//			System.out.println(d2);
//		} else if (d3.getAge() > d1.getAge() && d3.getAge() > d2.getAge()) {
//			System.out.println(d3);
//		}

//		System.out.println(d1.equals(d2)&&d1.equals(d3));
//		System.out.println(d2);
//		System.out.println(d3);
