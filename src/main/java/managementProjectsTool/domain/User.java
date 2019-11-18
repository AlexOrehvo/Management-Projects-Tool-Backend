package managementProjectsTool.domain;

import managementProjectsTool.common.enums.Permission;
import managementProjectsTool.domain.common.UUIDEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Constraint;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends UUIDEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    private Date last_login;

    @Column(name = "last_logout")
    private Date last_logout;

    @Column(name = "email_authorized")
    private Boolean emailAuthorized = false;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Permission> permissions = new HashSet<>();
}

