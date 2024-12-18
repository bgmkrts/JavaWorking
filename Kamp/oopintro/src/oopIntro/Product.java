package oopIntro;

public class Product {

	//encapsulation
	
	private int id;
	private String name;
	private String detail;
	private double unitPrice;
	private double discount;
	private double unitPriceAfterDiscount;
	
	public Product() {
		super();
	}

	
	public Product(int id, String name, String detail, double unitPrice, double discount,	double unitPriceAfterDiscount) {
		
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}



	// constructor:nesneleri başlatmak için kullanılan özel bir metottur
	
/*	public Product() {

		System.out.println("Ben çalıştım");
	}

	public Product(int id, String name, String detail, double unitPrice) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;

	}*/
	
	
	

}
