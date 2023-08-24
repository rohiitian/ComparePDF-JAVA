package com.springproject.pdfcompare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdfcompareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfcompareApplication.class, args);
	}
	
//	// Entity class
//	@Entity
//	@Table(name = "employees")
//	public class Employee {
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long id;
//	    
//	    @Column(name = "first_name")
//	    private String firstName;
//	    
//	    @Column(name = "last_name")
//	    private String lastName;
//	    
//	    // Getters and setters
//	}
//
//	// Repository interface
//	public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//	    // Additional methods can be defined here
//	}
//
//	// Service class
//	@Service
//	public class EmployeeService {
//	    private final EmployeeRepository employeeRepository;
//
//	    @Autowired
//	    public EmployeeService(EmployeeRepository employeeRepository) {
//	        this.employeeRepository = employeeRepository;
//	    }
//
//	    public List<Employee> getAllEmployees() {
//	        return employeeRepository.findAll();
//	    }
//	}
//
//	// Controller class
//	@RestController
//	public class EmployeeController {
//	    private final EmployeeService employeeService;
//
//	    @Autowired
//	    public EmployeeController(EmployeeService employeeService) {
//	        this.employeeService = employeeService;
//	    }
//
//	    @GetMapping("/employees")
//	    public List<Employee> getAllEmployees() {
//	        return employeeService.getAllEmployees();
//	    }
//	}


}
