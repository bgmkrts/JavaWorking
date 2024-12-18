package oopIntro;

public class Category {
	private int id;
	private String name;
	
	
	public Category() {
		super();
	}


	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
        return name1 + "!";   // Patron her isimden sonra ünlem olmasini istedi
	}


	public void setName(String name) {
		this.name = name;
	}



}
