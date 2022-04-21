package hello.springjpa.repository;

import hello.springjpa.domain.Member;

import java.util.List;

/**
 * Created by Hunseong on 2022/04/22
 */
public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
