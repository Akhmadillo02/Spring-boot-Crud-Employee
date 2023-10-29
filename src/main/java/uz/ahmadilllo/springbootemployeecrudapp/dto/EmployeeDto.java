package uz.ahmadilllo.springbootemployeecrudapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {


    private String name;
    private String email;
    private String gender;
}
