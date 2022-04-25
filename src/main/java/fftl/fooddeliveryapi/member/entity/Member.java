package fftl.fooddeliveryapi.member.entity;

import fftl.fooddeliveryapi.address.entity.MemberAddress;
import fftl.fooddeliveryapi.order.entity.Order;
import fftl.fooddeliveryapi.review.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private Boolean removed;

    @OneToMany
    private List<Order> orders;

    @OneToMany
    private List<MemberAddress> memberAddresses;

    @OneToMany
    private List<Review> reviews;

}
