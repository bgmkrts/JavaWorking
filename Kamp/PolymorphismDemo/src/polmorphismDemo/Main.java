package polmorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*	EmailLogger emailLogger=new EmailLogger();
		emailLogger.Log("Log mesajı");*/
		
		
		
	/*	BaseLogger[] base=new BaseLogger[] {new FileLogger(), new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		
		for(BaseLogger logger:base) {
			logger.Log("Log mesaj");
		}*/
		
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());  //  polymorphism      //Ileride Databese yerine file ile calicagiz veya Email gönderecgiz dendiginde sadece referansi degistir

		customerManager.add();
		

	}

}
