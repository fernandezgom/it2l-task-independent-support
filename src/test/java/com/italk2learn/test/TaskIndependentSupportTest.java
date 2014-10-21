package com.italk2learn.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.italk2learn.tis.Analysis;
import com.italk2learn.vo.HeaderVO;
import com.italk2learn.vo.TaskIndependentSupportRequestVO;
import com.italk2learn.vo.TaskIndependentSupportResponseVO;

public class TaskIndependentSupportTest extends junit.framework.TestCase {
	
	private static final Logger LOGGER = Logger
	.getLogger(TaskIndependentSupportTest.class);
	
	@Test
	public void testSetSomething() throws Exception{
		LOGGER.info("TESTING testSetSomething");
		TaskIndependentSupportRequestVO request= new TaskIndependentSupportRequestVO();
		request.setIdUser(1);
		//request.setHeaderVO(CheckConstants.HEADER_ES);
		boolean testOk = false;
		request.setHeaderVO(new HeaderVO());
		request.getHeaderVO().setLoginUser("jkeats");
		try {
			
			final TaskIndependentSupportResponseVO response = null;//new Analysis(true);
			if (response.getResponse()) {
				testOk = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
		}
		Assert.assertTrue(testOk);
	}
	
	@Test
	public void testGetSomehing() throws Exception{
		LOGGER.info("TESTING testGetSomehing");
		TaskIndependentSupportRequestVO request= new TaskIndependentSupportRequestVO();
		request.setIdUser(1);
		//request.setHeaderVO(CheckConstants.HEADER_ES);
		boolean testOk = false;
		request.setHeaderVO(new HeaderVO());
		request.getHeaderVO().setLoginUser("jkeats");
		request.setIdExercise(1);
		try {
			final TaskIndependentSupportResponseVO response = null;
			if (response.getResponse()) {
				testOk = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
		}
		Assert.assertTrue(testOk);
	}

}
