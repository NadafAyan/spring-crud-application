package app.vercel.ayannadaf.spring_crud_application.service;

import app.vercel.ayannadaf.spring_crud_application.entity.Employee;
import app.vercel.ayannadaf.spring_crud_application.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

//    public Employee createEmployee(Employee employeeReq) {
//        // Business Logic
//        Employee employeeResp = employeeRepository
//    }
}
