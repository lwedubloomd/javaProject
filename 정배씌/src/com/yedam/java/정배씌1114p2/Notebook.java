package com.home.java.hw221114.question2;

public interface Notebook {
	public static final int NOTEBOOK_MODE = 1;
	
	public abstract void writeDocumentation(String textProgram); // 문서를 작성하는 기능
	public abstract void searchInternet(String browser); // 인터넷을 검색하는 기능
}
