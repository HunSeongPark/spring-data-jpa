package hello.springjpa.repository;

import hello.springjpa.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/04/22
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

}
