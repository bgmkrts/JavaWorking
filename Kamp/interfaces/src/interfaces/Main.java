package interfaces;

public class Main {

	public static void main(String[] args) {
		
		  
		
		Logger[] loggers={new DatabaseLogger(),new EmailLogger(),new SmsLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer begüm=new Customer(1,"Begüm","KARATAŞ");
		
		customerManager.add(begüm);
		
		
		
		
		
	/*	CustomerManager customerManager=new CustomerManager(new EmailLogger()); // polymorphism      //Ileride sms yerine file  Email database gönderecegiz dendiginde sadece referansi degistir
		
		Customer begüm=new Customer(1,"Begüm","KARATAŞ");
				
		customerManager.add(begüm);
		
		
       
		*/
	
	}

}
