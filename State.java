package collection2;

public class State {
	private String name;
	private String capital;
	private String language;  //fgddjhyh
	private String code;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCapital(String capital) {
		this.capital=capital;
	}
	public String getCapital() {
		return capital;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setCode(String code) {
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	public State(String name,String capital,String language,String code) {
		this.name=name;
		this.capital=capital;
		this.language=language;
		this.code=code;
	}
	public String toString() {
		return name+capital+language+code;
	}

}
