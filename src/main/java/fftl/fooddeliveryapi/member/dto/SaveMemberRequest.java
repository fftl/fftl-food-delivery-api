package fftl.fooddeliveryapi.member.dto;

import fftl.fooddeliveryapi.member.entity.Member;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SaveMemberRequest {

    private String username;
    private String password;
    private String nickname;

    public Member toEntity(){
        return Member.builder()
            .username(username)
            .password(password)
            .nickname(nickname)
            .removed(false)
            .build();
    }
}
