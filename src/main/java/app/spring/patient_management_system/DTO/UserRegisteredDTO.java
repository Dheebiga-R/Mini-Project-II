package app.spring.patient_management_system.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisteredDTO {

    private String name;
	
	private String email_id;
	
	private String password;
	
	private String role;
	
}
