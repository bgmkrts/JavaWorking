package inheritange2;

public class Main {

	public static void main(String[] args) {
			/*LogManager lgmanager=new LogManager();
			lgmanager.log(1);*/
		
		CustomerManager customerM=new CustomerManager();
		//customerM.add(new DatabaseLogger());
		customerM.add(new FileLogger());       //polymorphism

	}

}
