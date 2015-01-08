package com.italk2learn.vo;

import java.util.List;

public class TaskIndependentSupportRequestVO extends RequestVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> words;
	
	private Boolean checkMathKeywords;
	
	private String feedbackText;
	private String currentFeedbackType;
	private String previousFeedbackType;
	private boolean followed;
	
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
	public String getPreviousFeedbackType() {
		return previousFeedbackType;
	}
	public void setPreviousFeedbackType(String previousFeedbackType) {
		this.previousFeedbackType = previousFeedbackType;
	}
	public boolean getFollowed() {
		return followed;
	}
	public void setFollowed(boolean followed) {
		this.followed = followed;
	}
	public String getFeedbackText() {
		return feedbackText;
	}
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

}
