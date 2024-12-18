package interfaces;

public class CustomerManager {
	/*private Logger loggers*/
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	
	
	public void add(Customer customer) {		
		
		//loosly-tightly coupled
		System.out.println("Müşteri eklendi:  " + customer.getFirstName());
		
		/*DatabaseLogger databaseLogger=new DatabaseLogger();
		databaseLogger.log(customer.getFirstName() + " veritabanına loglandı");*/
		/*this.logger.log(customer.getFirstName());*/
		
		
		/*for(Logger logger:loggers) {   // utils classı oluşturulup kod tekrarından kurtarıldı
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi:  " + customer.getLastName());
		/*DatabaseLogger databaseLogger=new DatabaseLogger();
		databaseLogger.log(customer.getFirstName() + " veritabanına loglandı");*/
		/*this.logger.log(customer.getFirstName());*/
		
		 /*	for(Logger logger:loggers) {    // utils classı oluşturulup kod tekrarından kurtarıldı
			logger.log(customer.getFirstName());*/
		
		Utils.runLoggers(loggers, customer.getLastName());

		}
	}


