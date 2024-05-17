//package com.innogent.training.runner;
//Testing for git pull and push from idea
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.innogent.training.repository.AddressRepo;
//import com.innogent.training.repository.CityRepo;
//import com.innogent.training.repository.CountryRepo;
//import com.innogent.training.repository.EmpRepo;
//import com.innogent.training.repository.StatesRepo;
//
//import jakarta.transaction.Transactional;
//
//@Component
//public class TestRunner implements CommandLineRunner {
//
//	@Autowired
//	private EmpRepo empRepo;
//
//	@Autowired
//	private StatesRepo statesRepo;
//
//	@Autowired
//	private CountryRepo countryRepo;
//
//	@Autowired
//	private CityRepo cityRepo;
//
//	@Autowired
//	private AddressRepo addressRepo;
//
//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//
//		/*
//		 * Employee emp1 = new Employee(); emp1.setEmpName("Tushar Patidar");
//		 * emp1.setJob("Software Developer"); emp1.setSal(1000.0);
//		 * 
//		 * Address add1 = new Address(); add1.setLocalAddress("Silicon City");
//		 * 
//		 * City existingCity = cityRepo.findByCityName("Indore");
//		 * 
//		 * City city; if (existingCity != null) { city =
//		 * cityRepo.findByCityName("Indore"); // city = existingCity; } else { city =
//		 * new City(); city.setCityName("Indore"); States state1 = new States();
//		 * state1.setStateName("M.P.");
//		 * 
//		 * Country country1 = new Country(); country1.setCountryName("India");
//		 * state1.setCountry(country1); city.setState(state1); }
//		 * 
//		 * add1.setCity(city);
//		 * 
//		 * emp1.setAddress(add1);
//		 * 
//		 * empRepo.save(emp1);
//		 */
//
//	}
//
//}
