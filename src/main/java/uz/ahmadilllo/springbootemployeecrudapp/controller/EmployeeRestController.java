package uz.ahmadilllo.springbootemployeecrudapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ahmadilllo.springbootemployeecrudapp.dto.EmployeeDto;
import uz.ahmadilllo.springbootemployeecrudapp.entity.Employee;
import uz.ahmadilllo.springbootemployeecrudapp.service.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeRestController {

    private final EmployeeServiceImpl employeeServiceimpl;

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee saveEmployee = employeeServiceimpl.save(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Long id) {
        EmployeeDto employeeId = employeeServiceimpl.findById(id);
        return new ResponseEntity<>(employeeId, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeServiceimpl.update(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity  deleteEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok("Delete employee");
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<EmployeeDto> employees = employeeServiceimpl.findAll();
        return ResponseEntity.ok(employees);

    }
}
