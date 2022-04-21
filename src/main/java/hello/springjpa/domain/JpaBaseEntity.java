package hello.springjpa.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Created by Hunseong on 2022/04/22
 */
@MappedSuperclass
@Getter
public class JpaBaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @PrePersist
    private void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = now;
        modifiedDate = now;
    }

    @PreUpdate
    private void preUpdate() {
        modifiedDate = LocalDateTime.now();
    }
}

// public class Member extends JpaBaseEntity {}
