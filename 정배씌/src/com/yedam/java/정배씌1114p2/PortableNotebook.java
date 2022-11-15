package com.home.java.hw221114.question2;

public class PortableNotebook implements Notebook, Tablet {

	public int mode = NOTEBOOK_MODE;
	public String textProgram;
	public String browser;
	public String videoType;
	public String appType;

	public PortableNotebook() {
		if(mode == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		} else if( mode == TABLET_MODE) {
			System.out.println("TABLET_MODE");
		}
	}

	@Override
	public void watchVideo(String videoType) {
		this.videoType = videoType;
		System.out.println(this.videoType + "를 시청");
	}

	@Override
	public void useApp(String appType) {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println(appType + "를 실행1");
		}
		System.out.println(appType + "를 실행2.");

	}

	@Override
	public void writeDocumentation(String textProgram) {
		this.textProgram = textProgram;
		System.out.println(this.textProgram + "을 통해 문서를 작성");

	}

	@Override
	public void searchInternet(String browser) {
		this.browser = browser;
		System.out.println(this.browser + "를 통해 인터넷을 검색");

	}

	public void changeMode() {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		} else if (mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}
}
