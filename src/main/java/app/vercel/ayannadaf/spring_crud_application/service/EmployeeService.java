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

        if (employeeResp.isPresent()) {
            return employeeResp.get();
        }

        return null;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeesList = employeeRepository.findAll();
        return employeesList;
    }

    public Employee updateEmployee(Long id, Employee employeeReq) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);

        if (existingEmployee.isEmpty()) {
            return null;
        }

        Employee employeeToSave = existingEmployee.get();

        employeeToSave.setId(employeeReq.getId());
        employeeToSave.setName(employeeReq.getName());
        employeeToSave.setAge(employeeReq.getAge());
        employeeToSave.setDesignation(employeeReq.getDesignation());

        Employee updatedEmployee = employeeRepository.save(employeeToSave);

        return updatedEmployee;
    }

    public Employee deleteEmployee(Long id) {
        Optional<Employee> employeeExists = employeeRepository.findById(id);

        if(employeeExists.isEmpty()) {
            return null;
        }

        employeeRepository.deleteById(id);
        return employeeExists.get();
    }

}
