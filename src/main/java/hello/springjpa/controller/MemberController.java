package hello.springjpa.controller;

import hello.springjpa.domain.Member;
import hello.springjpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunseong on 2022/04/22
 */
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    // Domain Class Converter를 통해 PK인 회원 ID를 @PathVariable로 받아
    // 내부적으로 Repository를 사용해 Entity를 찾음
    // !! Transaction이 아닌 범위에서 find를 통해 엔티티를 찾았으므로 Dirty Checking이 불가능
    // 단순 조회용으로만 사용. 수정 X
    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id")Member member) {
        return member.getUsername();
    }
}
