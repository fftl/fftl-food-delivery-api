package fftl.fooddeliveryapi.member.entity;

import fftl.fooddeliveryapi.member.dto.SaveMemberRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column
    private String username;
    @Column
    private String password;

    @Column
    private String nickname;
    @Column
    private Boolean deleted;

//    @OneToMany
//    private List<Order> orders;

//    @OneToMany
//    private List<MemberAddress> memberAddresses;

//    @OneToMany
//    private List<Review> reviews;

    public void updateMember(SaveMemberRequest saveMemberRequest) {
        this.nickname = saveMemberRequest.getNickname();
        this.username = saveMemberRequest.getUsername();
        this.password = saveMemberRequest.getPassword();
    }

    public void deleteMember(){
        this.deleted = true;
    }
}
