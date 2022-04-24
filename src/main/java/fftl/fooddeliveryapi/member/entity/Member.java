package fftl.fooddeliveryapi.member.entity;

import fftl.fooddeliveryapi.address.entity.MemberAddress;
import fftl.fooddeliveryapi.order.entity.Order;
import fftl.fooddeliveryapi.review.entity.Review;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Member {

    @Id
    private Long userId;

    @Column
    private String username;
    @Column
    private String password;

    @Column
    private String nickname;
    @Column
    private Boolean removed;

    @Column
    private List<Order> orders;
    @Column
    private List<MemberAddress> memberAddresses;
    @Column
    private List<Review> reviews;

}
