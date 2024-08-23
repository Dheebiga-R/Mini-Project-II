package app.spring.patient_management_system.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	@NotBlank(message="manditory field")
	private String name;
	
	@Column(nullable = false,unique=true)
	@NotBlank(message="manditory field")
	private String email;
	
	@Column(nullable=false)
	@NotBlank(message="manditory field")
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="users_roles", joinColumns = @JoinColumn(name="users_id",referencedColumnName = "id"),
	            inverseJoinColumns = @JoinColumn(name="roles_id",referencedColumnName = "id"))
	Set<Role> roles = new HashSet<Role>();
	
	
	
	
}
