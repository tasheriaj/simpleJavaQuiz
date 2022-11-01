package javaQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class QuizSetup {
 private ArrayList<JavaTester> javaQuestions;
 public QuizSetup() {
	 javaQuestions = new ArrayList<JavaTester>();
	 String q = "What is Java?";
	 String[] a = {"A tv show", "A programming language", "A dance move"};
	 javaQuestions.add(new JavaTester(q, a, "A programming language"));
	 q = "What is an object?";
	 a = new String[] {"An instance of a class", " A noun", "A variable"};
	 javaQuestions.add(new JavaTester(q , a, "An instance of a class"));
	 q = "Which of the following is not considered a primitive datatype?";
	 a = new String[] {"float", "string", "byte"};
	 javaQuestions.add(new JavaTester(q, a, "string"));
	 q = "What does OOP stand for?";
	 a = new String[] {"oriented object programming", "object over priced", "object oriented programming"};
	 javaQuestions.add(new JavaTester(q, a, "object oriented programming"));
	 q = "Which one is NOT one of the pillars of OOP?";
	 a = new String[] {"polymorphism", "inherited", "encapsulation"};
	 javaQuestions.add(new JavaTester(q, a, "inherited"));
	 q = "Which method can be used to output data?";
	 a = new String[] {"System.in", "System.out.println", "neither"};
	 javaQuestions.add(new JavaTester(q, a, "System.out.println"));
	 q = "Scanner class is:";
	 a = new String[] {"used to scan items", "a learning tool", "used to get user input"};
	 javaQuestions.add(new JavaTester(q, a, "used to get user input"));
	 q = "JDK stands for:";
	 a = new String[] {"java development kit", "just don't know", "java deployed kite"};
	 javaQuestions.add(new JavaTester(q, a, "java development kit"));
	 q = "Which defines class:";
	 a = new String[] {"elegance", "blueprint that defines data member and methods of an object", "school work"};
	 javaQuestions.add(new JavaTester(q, a, "blueprint that defines data member and methods of an object"));
	 q = "\"public static void main()\" is considered what?";
	 a = new String[] {"a statement", "a strategy", "a method"};
	 javaQuestions.add(new JavaTester(q, a, "a method"));
	 Collections.shuffle(javaQuestions, new Random());
 }
	public void begin() {
		
		
			Scanner scan = new Scanner(System.in);
		String userInput = new String();
		int numCorrect = 0;
		//show questions from javaQuestions
		for (int question = 0; question < javaQuestions.size(); question++) {
		System.out.println(javaQuestions.get(question).askQuestion());
		int numOptions = javaQuestions.get(question).giveOptions().size();
		for (int option = 0; option < numOptions; option++) {
			System.out.println((option + 1) + ":" + javaQuestions.get(question).giveOptions().get(option));
		}
		int userResponse = scan.nextInt();
		ArrayList<String> optionSet =
				javaQuestions.get(question).giveOptions();
		
		String correctAnswer = javaQuestions.get(question).getAnswer();
		int correctAnswered = optionSet.indexOf(correctAnswer);
		if (userResponse == correctAnswered + 1) {
			numCorrect++;
		}
	}
			 
			 System.out.println("You got " + numCorrect + " out of 10!");
			 
	}
			 
			 
			 
}
