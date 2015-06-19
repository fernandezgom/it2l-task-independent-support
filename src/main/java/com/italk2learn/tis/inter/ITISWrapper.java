package com.italk2learn.tis.inter;

import java.util.List;

public interface ITISWrapper {
	
	public void startTIS();
	
	public void stopTimers();
	
	public void sendTDStoTIS(String user, List<String> feedback, String type, String feedbackID, int level, boolean followed, boolean viewed);
	
	public void sendSpeechOutputToSupport(String user, List<String> currentWords);
	
	public void startNewExercise();
	
	public void setFractionsLabinUse(boolean value);
	
	public boolean getFractionsLabInUse();
	
	public byte[] getAudio();
	
	public void setAudio(byte[] currentAudioStudent);

	public String getMessage();
	
	public boolean getPopUpWindow();
	
	public void setMessage(String value, boolean popUpWindow, String type);

	public void setPopUpWindow(boolean value);
	
	public String getFeedbackType();
	
	public String getCurrentAffect();
	
	public void sendDoneButtonPressedToTIS(boolean value);
	
	public void setLanguageInTIStoEnglish();
	
	public void setLanguageInTIStoSpanish();
	
	public void setLanguageInTIStoGerman();
	
	public boolean getTDSfeedback();
	
	public void popUpOpen();
	
	public void popUpClosed();

}
