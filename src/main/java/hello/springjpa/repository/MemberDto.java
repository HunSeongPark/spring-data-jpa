package hello.springjpa.repository;

import lombok.Data;

/**
 * Created by Hunseong on 2022/04/22
 */
@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
