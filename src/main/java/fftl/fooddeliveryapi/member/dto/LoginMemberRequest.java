package fftl.fooddeliveryapi.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LoginMemberRequest {

    private String username;
    private String password;
}
