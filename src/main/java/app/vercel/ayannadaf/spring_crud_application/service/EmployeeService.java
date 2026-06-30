package app.vercel.ayannadaf.spring_crud_application.service;

import app.vercel.ayannadaf.spring_crud_application.entity.Employee;
import app.vercel.ayannadaf.spring_crud_application.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employeeReq) {
        // Business Logic
        Employee employeeResp = employeeRepository.save(employeeReq);
        return employeeResp;
    }

    public Employee getEmployee(Long id) {
        Optional<Employee> employeeResp = employeeRepository.findById(id);

        if(employeeResp.isPresent()) {
        return employeeResp.get();
        }

        return null;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeesList = employeeRepository.findAll();
        return employeesList;
    }
}
