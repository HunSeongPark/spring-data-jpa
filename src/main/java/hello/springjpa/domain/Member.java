package hello.springjpa.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hunseong on 2022/04/21
 */
@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;
}
