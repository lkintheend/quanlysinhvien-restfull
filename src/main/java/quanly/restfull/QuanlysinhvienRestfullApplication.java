package quanly.restfull;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"quanly.sinhvien","quanly.restfull"})
public class QuanlysinhvienRestfullApplication implements CommandLineRunner{
//	@Autowired
//	MonHocServiceImp monHocServiceImp;
	public static void main(String[] args) {
		SpringApplication.run(QuanlysinhvienRestfullApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(monHocServiceImp.findAll());
	}
}
