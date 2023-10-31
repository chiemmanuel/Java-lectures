package lecture4;

import java.util.ArrayList;
import java.util.List;

import lecture4.Animal.Newyorkian;
import lecture4.Animal.Pig;

public class Farm {
	
	public void getAnimalSound(List<Animal> animals) {
		animals.forEach((a) -> {a.animalSound();});	
	}
	public static void main(String[]args) {
		Newyorkian myGuy = new Newyorkian();
		Pig piggyPig = new Pig();
		piggyPig.animalSound();
		piggyPig.sleep();
		myGuy.animalSound();
		myGuy.sleep();
		
		List<Animal>animals = new ArrayList<>();
		animals.add(piggyPig);
		animals.add(myGuy);
		Farm farm = new Farm();
		farm.getAnimalSound(animals); 
		
	}
}

