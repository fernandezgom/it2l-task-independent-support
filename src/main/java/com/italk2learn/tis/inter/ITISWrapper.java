package com.italk2learn.tis.inter;

import java.util.List;

import com.italk2learn.vo.TaskIndependentSupportRequestVO;

public interface ITISWrapper {
	
	public void sendTDStoTIS(String user, List<String> feedback, String type, int level, boolean followed, boolean viewed);
	
	public void sendSpeechOutputToSupport(String user, TaskIndependentSupportRequestVO request);
	
	public void startNewExercise();
	
	public void setFractionsLabinUse(boolean value);
	
	public boolean getFractionsLabInUse();
	
	public byte[] getAudio();
	
	public void setAudio(byte[] currentAudioStudent);

	public String getMessage();
	
	public boolean getPopUpWindow();
	
	public void setMessage(String value);

	public void setPopUpWindow(boolean value);
	
	public String getFeedbackType();
	
	public String getCurrentAffect();

}
