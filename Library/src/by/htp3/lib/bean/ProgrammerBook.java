package by.htp3.lib.bean;

public class ProgrammerBook extends Book {
	private String level;
	private String language;
	
	public ProgrammerBook(){
		super("no title", 0);//new Book("",0);
		level="no";
		language = "";
	}
	
	public ProgrammerBook(String title, int price, String level, String language){
		super(title, price);
		this.level = level;
		this.language = language;
		
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
