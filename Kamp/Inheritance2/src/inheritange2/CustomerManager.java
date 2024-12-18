package inheritange2;

public class CustomerManager {
	public void add(Logger logger) {
		//müşteri ekleme
		System.out.println("Müşteri eklendi");
		
		//DatabaseLogger db=new DatabaseLogger();
		logger.log();
	}

}
