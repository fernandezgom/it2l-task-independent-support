package com.italk2learn.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.gienah.testing.junit.Configuration;
import org.gienah.testing.junit.Dependency;
import org.gienah.testing.junit.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.web.client.RestTemplate;

import com.italk2learn.tis.Analysis;
import com.italk2learn.vo.HeaderVO;
import com.italk2learn.vo.SpeechRecognitionRequestVO;
import com.italk2learn.vo.SpeechRecognitionResponseVO;
import com.italk2learn.vo.TaskIndependentSupportRequestVO;

@RunWith(value = SpringRunner.class)
@Configuration(locations = { "web-application-config.xml" })
public class TaskIndependentSupportTest {
	
	@Dependency
	private RestTemplate restTemplate;
	
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
	
	
	@Test
	public void sendRealSpeechToSupport() throws Exception{
		final Analysis an = new Analysis();
		SpeechRecognitionRequestVO request= new SpeechRecognitionRequestVO();
		SpeechRecognitionResponseVO liveResponse=new SpeechRecognitionResponseVO();
		request.setHeaderVO(new HeaderVO());
		request.getHeaderVO().setLoginUser("student1");
		request.setInstance(1);
		boolean testOk = false;
		File f=new File("bbc1.wav");
		long l=f.length();
		System.out.println("the file is " + l + " bytes long");
		FileInputStream finp = null;
		byte[] b=new byte[(int)l];
		try {
			finp = new FileInputStream(f);
			int i;
			i=finp.read(b);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] aux1=Arrays.copyOfRange(b, 0, (int)l/4);
		byte[] aux2=Arrays.copyOfRange(b, ((int)l/4)+1, (int)l/2);
		byte[] aux3=Arrays.copyOfRange(b, ((int)l/2)+1, (int)(3*l)/4);
		byte[] aux4=Arrays.copyOfRange(b, ((int)(3*l)/4), (int)l-1);
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("user", "tludmetal");
		vars.put("instance", "1");
		vars.put("server", "localhost");
		vars.put("language", "en_ux");
		vars.put("model", "base");
		try {
			//Call initEngineService of an available instance
			Boolean isOpen=this.restTemplate.getForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/initEngine?user={user}&instance={instance}&server={server}&language={language}&model={model}",Boolean.class, vars);
			if (isOpen){
				request.setData(b);
				liveResponse=this.restTemplate.postForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/sendData", request, SpeechRecognitionResponseVO.class);
				//an.sendSpeechOutputToSupport(liveResponse.getResponse());
//				request.setData(aux2);
//				liveResponse=this.restTemplate.postForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/sendData", request, SpeechRecognitionResponseVO.class);
//				request.setData(aux3);
//				liveResponse=this.restTemplate.postForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/sendData", request, SpeechRecognitionResponseVO.class);
//				request.setData(aux4);
//				liveResponse=this.restTemplate.postForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/sendData", request, SpeechRecognitionResponseVO.class);
			}
			String response=this.restTemplate.getForObject("http://193.61.29.166:8081/italk2learnsm/speechRecognition/closeEngine?instance={instance}",String.class, "1");
			if (response!=null)
				testOk = true;
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
		}
		Assert.assertTrue(testOk);
	}
	

}
