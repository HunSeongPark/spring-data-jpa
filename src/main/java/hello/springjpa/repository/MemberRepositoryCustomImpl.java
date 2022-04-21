package hello.springjpa.repository;

import hello.springjpa.domain.Member;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Hunseong on 2022/04/22
 */
@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom {

    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
