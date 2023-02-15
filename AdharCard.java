package collection2;

public class AdharCard {
	private long number;
	private String name;
	private String fatherName;
	private boolean isMale;
	
	public void setNumber(long number) {
		this.number=number;
	}
	public long getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setFatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	
	public AdharCard(long number,String name,String fatherName,boolean isMale) {
		this.number=number;
		this.name=name;
		this.fatherName=fatherName;
		this.isMale=isMale;
	}
	public String toString() {
		return number+name+fatherName+isMale;
	}

}
