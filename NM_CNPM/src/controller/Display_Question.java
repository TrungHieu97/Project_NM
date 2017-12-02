package controller;
import java.util.Vector;

import model.*;
import view.*;

public class Display_Question {
	
	public void Display() {
		
	}
	public static void main(String[] args) {
		Get_Question getQuestion =new Get_Question();
		Vector questionList =new Vector();
		questionList = getQuestion.Get_Data_Question();
		for(int i=0 ; i < questionList.size() ; i++) {
			Question ch =(Question) questionList.get(i);
			System.out.println(ch.concept +"\n"+ch.Answer1 /*+" "+ ch.Answer2+" "+ch.Answer3+" "+ch.Answer4 */);
		}
	}
}

