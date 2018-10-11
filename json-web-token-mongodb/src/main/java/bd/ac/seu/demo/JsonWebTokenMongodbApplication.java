package bd.ac.seu.demo;

import bd.ac.seu.demo.model.GeneralEvent;
import bd.ac.seu.demo.model.SpecialEvent;
import bd.ac.seu.demo.model.User;
import bd.ac.seu.demo.model.UserDto;
import bd.ac.seu.demo.repo.GeneralEventRepository;
import bd.ac.seu.demo.repo.SpecialEventRepository;
import bd.ac.seu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JsonWebTokenMongodbApplication {

	@Autowired
	GeneralEventRepository generalEventRepository;
	@Autowired
	SpecialEventRepository specialEventRepository;
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(JsonWebTokenMongodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner () {
		return args -> {

//			generalEventRepository.save(new GeneralEvent("picnic1", "near dhaka", "1-1-1"));
//			generalEventRepository.save(new GeneralEvent("picnic2", "near dhaka", "2-3-1"));
//			generalEventRepository.save(new GeneralEvent("picnic3", "near dhaka", "3-3-1"));
//			generalEventRepository.save(new GeneralEvent("picnic4", "near gazipur", "4-4-1"));
//			generalEventRepository.save(new GeneralEvent("picnic5", "near gazipur", "4-4-1"));
//			generalEventRepository.save(new GeneralEvent("picnic6", "near gazipur", "4-4-1"));
//			generalEventRepository.save(new GeneralEvent("picnic7", "near gazipur", "4-4-1"));
//			generalEventRepository.save(new GeneralEvent("picnic8", "near gazipur", "4-4-1"));
//			generalEventRepository.save(new GeneralEvent("picnic9", "near gazipur", "4-4-1"));
//
//			specialEventRepository.save(new SpecialEvent("picnic10", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic11", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic12", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic13", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic14", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic15", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic16", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic17", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic18", "near dhaka", "1-1-1"));
//			specialEventRepository.save(new SpecialEvent("picnic19", "near dhaka", "1-1-1"));
		};
	}
}
