package Homework_14;

public class AI implements IWebsiteCreator {
	public String name;
	public String language;
	public AI(String nameInput, String languageInput) 
	{this.name = nameInput;
	this.language = languageInput;
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.println(language + " automated Setup template: "+ template);
		System.out.println(language + " automated Set Title name: "+ titleName);
	}
}
