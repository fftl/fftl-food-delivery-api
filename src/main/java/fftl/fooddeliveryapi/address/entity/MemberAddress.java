package fftl.fooddeliveryapi.address.entity;

import fftl.fooddeliveryapi.member.entity.Member;

import javax.persistence.*;

@Entity
public class MemberAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberAddressId;

    @Column
    private String address;
    @Column
    private Double lat; //위도
    @Column
    private Double lon; //경도

//    @ManyToOne
//    private Member member;

}
