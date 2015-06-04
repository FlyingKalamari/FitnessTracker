//@TODO: implement error handling 

import java.util.Scanner;

public class Controller
{
	public static double centimetresToInches(double cm)
	{
		return cm/2.54;
	}
	
	public static double inchesToCentimetres(double in)
	{
		return in * 2.54;
	}
	
	
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the PowerLifting App 2.0!");
		System.out.println("Please enter in your name: ");
		String userName = keyboard.next();
		
		System.out.println("Please enter in your gender: ");
		String gender = keyboard.next();
		
		System.out.println("Please enter in your weight in lbs: ");
		double weight = keyboard.nextDouble();
		
		System.out.println("Please enter in your weight in cm: ");
		double height = keyboard.nextDouble();
		
		System.out.println("Please enter in your birthdate in mm/dd/yyyy format: ");
		String birthDate = keyboard.next();
		
		System.out.println("What are your fitness goals? \n(1) Weight loss\n(2) Endurance training\n(3) Bodybuilding\n(4) Powerlifting");
		int userChoice = keyboard.nextInt();
		String printMsg = "";
		String workoutRoutine = "";
		
		switch(userChoice)
		{
		case 1:
			printMsg = "You have selected Weight loss!";
			workoutRoutine = "Cardio Focused";
			break;
		case 2:
			printMsg = "You have selected Endurance Training!";
			break;
		case 3:
			printMsg = "You have selected Bodybuilding!";
			break;
		
		case 4:
			printMsg = "You have selected Powerlifting!";
			break;
		
		default:
			printMsg = "Invalid selection!"; 
			break;
		}
		
	
	System.out.println(printMsg);
	
	/*
	System.out.println("What is your age?");
	int age = keyboard.nextInt();
	
	double iHeight = centimetresToInches(height);
	double BMI = 703 * weight/(iHeight*iHeight);
	String BMIStatus = "";
	
	if(BMI < 0)
	{
		//error invalid BMI
	}
	
	else if(BMI>=0 && BMI<=18.5)
	{
		BMIStatus = "underweight";
	}
	
	else if(BMI> 18.5 && BMI<=24.9)
	{
		BMIStatus = "normal";
	}
	
	else if(BMI>= 25 && BMI<=29.9)
	{
		BMIStatus = "overweight";
	}
	
	else if(BMI>= 30)
	{
		BMIStatus = "obese";
	}

	System.out.println("Your BMI reads: " + (int)BMI + " This BMI Number is considered " + BMIStatus);
	*/
	
	}
}