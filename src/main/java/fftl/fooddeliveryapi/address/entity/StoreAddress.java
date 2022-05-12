package fftl.fooddeliveryapi.address.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "store_address")
public class StoreAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeAddressId;

    @Column
    private String address;

    @Column
    private Double lat; //위도

    @Column
    private Double lon; //경도

}
