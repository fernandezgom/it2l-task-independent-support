package com.italk2learn.tis;

public class Analysis {
	boolean includeAffect = true;
	boolean presentAccordingToAffect = true;
	String[] currentWords;
	String currentUser;

	public Analysis() {
	}

	public void startSupport(boolean start) {
	}

	public void sendCurrentUserToSupport(String user) {
		currentUser = user;
	}

	public void sendSpeechOutputToSupport(String[] words) {
		currentWords = words;
		for (int i = 0; i < currentWords.length; i++) {
			System.out.println(currentWords[i] + " ");
		}
	}
}
