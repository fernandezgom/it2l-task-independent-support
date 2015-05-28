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
	public boolean fromTDS;


	public boolean isFromTDS() {
		return fromTDS;
	}

	public void setFromTDS(boolean fromTDS) {
		this.fromTDS = fromTDS;
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
