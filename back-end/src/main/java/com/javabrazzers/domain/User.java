package com.javabrazzers.domain;

import com.javabrazzers.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "user_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity implements UserDetails {

    @NotBlank
    @Size(min = 2, max = 20, message = "errors.user.firstname.value.size")
    @Column(name = "fist_name", nullable = false, length = 20, unique = true)     //unique уникальное значение
	private String firstName;
    @NotBlank
    @Size(min = 2, max = 20, message = "errors.user.lastname.value.size")
    @Column(name = "last_name", nullable = false, length = 20, unique = true)
	private String lastName;
    @NotBlank
    @Size(min = 6, max = 20, message = "errors.user.password.value.size")
    @Column(name = "password", nullable = false, length = 20, unique = true)
	private String password;
    @NotBlank
    @Email
    @Size(min = 2, max = 30, message = "errors.user.email.value.size")
    @Column(name = "email", nullable = false, length = 30, unique = true)
	private String email;

	private boolean active;
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    //создает в базе необходимую таблицу и колонку.
    @CollectionTable(name = "user2roles_tbl", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    @ManyToMany(mappedBy = "user_id")
	private Set<Role> roles;

    public boolean isAdmin(){
        return roles.contains(Role.ADMIN);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email; // ?????
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}