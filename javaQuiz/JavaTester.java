package javaQuiz;

import java.util.ArrayList;
import java.util.Collections;

public class JavaTester {

	private String questions;
	private ArrayList<String> options;
	private String answer;
	
	public JavaTester(String questions, String[] options, String answer) {
		this.questions = questions;
		this.options = new ArrayList<String>();
		for (int i = 0; i < options.length; i++) {
			this.options.add(options[i]);
		}
		//make each question show in a different order
		Collections.shuffle(this.options);
		this.answer = answer;
	}//methods for each variable(questions, options, and answer)
	public String askQuestion() {
		return questions;
		
	}
	public ArrayList<String> giveOptions(){
		return options;
	}
	public String getAnswer() {
		return answer;
	}
}
