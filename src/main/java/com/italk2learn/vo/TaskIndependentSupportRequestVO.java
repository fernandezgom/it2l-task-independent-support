package com.italk2learn.vo;

import java.util.List;

public class TaskIndependentSupportRequestVO extends RequestVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> words;
	
	private Boolean checkMathKeywords;
	
	private List<String> feedbackText;
	private String currentFeedbackType;
	private int level;
	private String feedbackID;
	private boolean followed;
	private boolean viewed;
	private boolean flEnable;
	private boolean donePressed;
	
	private int File;
	
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
	public Boolean getCheckMathKeywords() {
		return checkMathKeywords;
	}
	public void setCheckMathKeywords(Boolean checkMathKeywords) {
		this.checkMathKeywords = checkMathKeywords;
	}
	
	public int getFile() {
		return File;
	}
	public void setFile(int file) {
		File = file;
	}
	public String getCurrentFeedbackType() {
		return currentFeedbackType;
	}
	public void setCurrentFeedbackType(String currentFeedbackType) {
		this.currentFeedbackType = currentFeedbackType;
	}
	public boolean getFollowed() {
		return followed;
	}
	public void setFollowed(boolean followed) {
		this.followed = followed;
	}
	public List<String> getFeedbackText() {
		return feedbackText;
	}
	public void setFeedbackText(List<String> feedbackText) {
		this.feedbackText = feedbackText;
	}
	public boolean isFlEnable() {
		return flEnable;
	}
	public void setFlEnable(boolean flEnable) {
		this.flEnable = flEnable;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	public String getFeedbackID() {
		return feedbackID;
	}
	public void setFeedbackID(String feedbackID) {
		this.feedbackID = feedbackID;
	}
	public boolean isDonePressed() {
		return donePressed;
	}
	public void setDonePressed(boolean donePressed) {
		this.donePressed = donePressed;
	}

}
