package com.swich.test;

public class Main2 {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Rex", Breed.BASENJI, 4);
        dogs[1] = new Dog("Ralf", Breed.AZAWAKH, 8);
        dogs[2] = new Dog("Rex", Breed.BORZOI, 6);

        if (checkSame(dogs)){
            System.out.println("There are same names");
        }else {
            System.out.println("There are no same names");
        }

        Dog oldest = getOldest(dogs);
        System.out.println("The oldest dog is: " + oldest.getName() + " " + oldest.getBreed());

    }

    public static boolean checkSame(Dog[] dogs){

        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (dogs[i].getName() == dogs[j].getName() && !dogs[i].equals(dogs[j])){
                    return  true;
                }
            }
        }
        return false;

    }

    public static Dog getOldest(Dog[] dogs){

        Dog oldest = dogs[0];

        for (int i = 0; i < dogs.length; i++) {
            if(dogs[i].getAge() > oldest.getAge()){
                oldest = dogs[i];
            }
        }

        return oldest;
    }

}
