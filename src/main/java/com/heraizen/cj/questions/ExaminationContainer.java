package com.heraizen.cj.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ExaminationContainer {

private static final String FILE_NAME="questions.json";
	
	private static List<Questions> questions;
	private static Map<Integer,String> qus_ans_map;
	static int attempt=0;
	public ExaminationContainer()
	{
		questions=QuestionReader.readQuestionByJson(FILE_NAME);
		qus_ans_map=getQuestionAndAnswer(questions);
	}
	private static Map<Integer,String> getQuestionAndAnswer(List<Questions> questions) {
		Map<Integer,String> map=new HashMap<>();
		for(Questions q:questions)
		{
			map.put(q.getQid(), q.getAnswer());
		}
		return map;
	}
	public void beginTest()
	{
		Map<Integer,String> answer=new HashMap<>();
		List<String> index=Arrays.asList("A,B,C,D".split(","));
		for(Questions q:questions)
		{
			System.out.println(q.getQid()+"."+q.getQuestionDate());
			int i=0;
			for(String option:q.getOptions())
			{
				System.out.println(index.get(i++)+"."+option);
			}
			System.out.println("Enter Your Choice:..");
			String choice=new Scanner(System.in).nextLine();
			if(choice.length()>0)
				attempt++;
			answer.put(q.getQid(), choice.toUpperCase());
		}
		showResult(answer);
		
	}
	private void showResult(Map<Integer, String> answer) {
		System.out.println("Total Questions: "+questions.size());
		System.out.println("Total Attempted: "+attempt);
		Set<Integer> keys=answer.keySet();
		int correct=0;
		int wrong =0;
		for(Integer key:keys)
		{
			if(answer.get(key).equals(qus_ans_map.get(key)))
				correct++;
			else if(answer.get(key).length()<0)
				wrong++;
		}
		System.out.println("No. of correct answer: "+correct);
		System.out.println("No. of wrong answer: "+wrong);
		double percentage=(correct/questions.size())*100;
		System.out.println("Your secure Percentage: "+percentage);
	}
}
