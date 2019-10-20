package com.heraizen.cj.questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions {
	private int qid;
	private String questionDate;
	private List<String> options=new ArrayList<>();
	private String  answer;
	public Questions()
	{
		
	}
	public Questions(int qid, String questionDate, List<String> options, String answer) {
		super();
		this.qid = qid;
		this.questionDate = questionDate;
		this.options = options;
		this.answer = answer;
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionDate() {
		return questionDate;
	}
	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", questionDate=" + questionDate + ", options=" + options + ", answer="
				+ answer + "]";
	}
	
	
	
}
