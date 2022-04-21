package hello.springjpa.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by Hunseong on 2022/04/22
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Item implements Persistable<String> {

    // 생성 시 영속성 컨텍스트가 아닌 직접 String 값으로 Id 주입
    // 생성 시점에 id가 null이 아니므로 JpaRepository save() 내부 isNew에서 merge가 수행됨
    // Persistable 오버라이딩을 통해 해결해야함
    @Id
    private String id;

    @CreatedDate
    private LocalDateTime createdDate;

    public Item(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return createdDate == null;
    }
}
