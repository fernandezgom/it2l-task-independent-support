package com.italk2learn.tis;

import java.util.TimerTask;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TimerForSpeechCheck extends TimerTask {
	Analysis analysis;
	
	public void setAnalysis(Analysis elem){
		analysis = elem;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void run() {
		analysis.checkIfSpeaking();
	}
}