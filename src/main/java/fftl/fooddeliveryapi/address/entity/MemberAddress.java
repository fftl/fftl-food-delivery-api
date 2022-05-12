package fftl.fooddeliveryapi.address.entity;

import javax.persistence.*;

@Entity(name = "member_address")
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

}
