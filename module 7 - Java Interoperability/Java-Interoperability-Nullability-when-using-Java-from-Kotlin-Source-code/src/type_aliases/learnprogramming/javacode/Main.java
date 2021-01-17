package type_aliases.learnprogramming.javacode;

import type_aliases.learnprogramming.calljava.Car;
import type_aliases.learnprogramming.calljava.SingletonObj;
import type_aliases.learnprogramming.calljava.StaticCar;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		StaticCar.topLevel();  //classe gerada automaticamento para poder chamar as topLevels funcionns

		StaticCar.print("print this Java string");

		Car car = new Car("blue", "BMW", 2011);
		System.out.println(car.model); ///nao compila, tem que chamar o getModel() ou colocar a annotation do kt pra deixar chamar pelo property
		System.out.println(car.getColor());

		//Car.Companion.carComp();  com a anntation no kt n precisa do Companion
		Car.carComp();
		System.out.println("isAuto = " + Car.constant); //se for const nem precisa de annotation no KT
		System.out.println("isAuto = " + Car.isAuto);
		//SingletonObj.INSTANCE.doSomething(); com a anntation no kt n precisa do INSTANCE
		SingletonObj.doSomething();

		//car.printMe(null);

		try {
			StaticCar.doIO();
		}
		catch (IOException e) {
			System.out.println("IOException!");
		}

		StaticCar.defaultArgs("The Number is: ");


	}
}
