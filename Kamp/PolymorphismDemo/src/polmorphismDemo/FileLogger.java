package polmorphismDemo;

public class FileLogger extends BaseLogger {
	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandı:"+message);
	}

}
