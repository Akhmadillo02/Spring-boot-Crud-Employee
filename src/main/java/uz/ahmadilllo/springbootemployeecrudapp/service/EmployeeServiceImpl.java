package uz.ahmadilllo.springbootemployeecrudapp.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.ahmadilllo.springbootemployeecrudapp.dto.EmployeeDto;
import uz.ahmadilllo.springbootemployeecrudapp.entity.Employee;
import uz.ahmadilllo.springbootemployeecrudapp.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final ModelMapper modelMapper;

    private final EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {
        Employee employeeSave = employeeRepository.save(employee);
        return employeeSave;
    }

    @Override
    public Employee update(Employee employee) {
        Employee update = employeeRepository.save(employee);
        return update;
    }

    @Override
    public EmployeeDto findById(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
        return employeeDto;
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }


    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDto.class))
                .collect(Collectors.toList());
    }
}
