package com.italk2learn.vo;

public class TaskIndependentSupportResponseVO extends ResponseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//JLF: StudentInfo and Language is on the header
	
	private String taskInfoPackage;
	
	private boolean response;
	
	public boolean popUpWindow = true;
	public String message = "";
	public boolean fromTIS;

	public boolean isFromTIS() {
		return fromTIS;
	}

	public void setFromTIS(boolean fromTIS) {
		this.fromTIS = fromTIS;
	}

	public boolean getResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}


	public String getTaskInfoPackage() {
		return taskInfoPackage;
	}

	public void setTaskInfoPackage(String taskInfoPackage) {
		this.taskInfoPackage = taskInfoPackage;
	}
	
	public String getMessage(){
		return message;
	}
	
	public boolean getPopUpWindow(){
		return popUpWindow;
	}
	
	public void setMessage(String value) {
		message = value;
	}

	public void setPopUpWindow(boolean value){
		popUpWindow = value;
	}

}
