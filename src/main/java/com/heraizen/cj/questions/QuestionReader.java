package com.heraizen.cj.questions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class QuestionReader {

	private QuestionReader()
	{
		
	}
	public static List<Questions> readQuestionByJson(String FILE_NAME)
	{
		List<Questions> questions=null;
		ObjectMapper mapper=new ObjectMapper();
		try {
			questions=mapper.readValue(new File(FILE_NAME), new TypeReference<List<Questions>>() {
			});
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return questions;
	}
	
}
