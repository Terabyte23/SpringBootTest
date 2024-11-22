package ee.ivkhk.SpringBootTest;

import ee.ivkhk.SpringBootTest.interfaces.AppService;
import ee.ivkhk.SpringBootTest.interfaces.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication implements CommandLineRunner {

	@Autowired
	private Input input;
	@Autowired
	private AppService userService;
	@Autowired
	private AppService productService;

	@Override
	public void run(String... args) throws Exception {
		boolean repeat = true;
		do{
			System.out.println("Список задач: ");
			System.out.println("0. Выход");
			System.out.println("1. Добавить пользователя");
			System.out.println("2. Добавить продукт");
			System.out.println("Выберите задачу из списка: ");
			int task = Integer.parseInt(input.nextLine());
			switch (task){
				case 0: repeat = false; break;
				case 1:
					if(userService.add()){
						System.out.println("Пользователь добавлен");
					}else{
						System.out.println("Пользователя добавить не удалось");
					}
					break;
				case 2:
					if(productService.add()){
						System.out.println("Продукт добавлен");
					}else{
						System.out.println("Продукт добавить не удалось");
					}
					break;
				default:
					System.out.println("Выбрана задача из списка");
					break;
			}
			System.out.println("До свидания!");

		}while (repeat);
		System.out.println("Выбрана задача не из списка");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
}
