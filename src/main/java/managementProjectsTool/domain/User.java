package managementProjectsTool.domain;

import managementProjectsTool.common.enums.Permission;
import managementProjectsTool.domain.common.UUIDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Set;

@Entity
public class User extends UUIDEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    private Set<Permission>
}
