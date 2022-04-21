package hello.springjpa.repository;

import hello.springjpa.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/04/22
 */
public interface TeamRepository extends JpaRepository<Team, Long> {

}
