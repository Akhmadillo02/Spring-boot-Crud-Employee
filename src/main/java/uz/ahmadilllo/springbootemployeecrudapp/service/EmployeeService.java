package uz.ahmadilllo.springbootemployeecrudapp.service;


import uz.ahmadilllo.springbootemployeecrudapp.dto.EmployeeDto;
import uz.ahmadilllo.springbootemployeecrudapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee update(Employee employee);

    EmployeeDto findById(Long id);

    void deleteById(Long id);

   List<EmployeeDto> findAll();

}
