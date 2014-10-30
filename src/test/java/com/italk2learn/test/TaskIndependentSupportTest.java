package com.italk2learn.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.italk2learn.tis.Analysis;
import com.italk2learn.vo.HeaderVO;
import com.italk2learn.vo.TaskIndependentSupportRequestVO;

public class TaskIndependentSupportTest {
	
	private static final Logger LOGGER = Logger
	.getLogger(TaskIndependentSupportTest.class);
	
	@Test
	public void sendSpeechToSupport() throws Exception{
		LOGGER.info("TESTING sendSpeechToSupport");
		TaskIndependentSupportRequestVO request= new TaskIndependentSupportRequestVO();
		String words[]={"hello","this","is","a","test"};
		boolean testOk = false;
		request.setHeaderVO(new HeaderVO());
		request.getHeaderVO().setLoginUser("student1");
		request.setWords(words);
		try {
			final Analysis response = new Analysis();
			response.sendSpeechOutputToSupport(request.getWords());
			testOk = true;
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
		}
		Assert.assertTrue(testOk);
	}
	

}
