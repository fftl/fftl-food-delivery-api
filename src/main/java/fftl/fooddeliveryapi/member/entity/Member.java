package fftl.fooddeliveryapi.member.entity;

import fftl.fooddeliveryapi.address.entity.MemberAddress;
import fftl.fooddeliveryapi.order.entity.Order;
import fftl.fooddeliveryapi.review.entity.Review;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Member {

    @Id
    private Long userId;

    private String username;
    private String password;

    private String nickname;
    private Boolean removed;

    private List<Order> orders;
    private List<MemberAddress> memberAddresses;
    private List<Review> reviews;
}
