package app.vercel.ayannadaf.spring_crud_application.repository;

import app.vercel.ayannadaf.spring_crud_application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
