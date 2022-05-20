package fftl.fooddeliveryapi.address.dto;

import fftl.fooddeliveryapi.address.entity.MemberAddress;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SaveMemberAddressRequest {

    private String address;
    private Double lat;
    private Double lon;

    public MemberAddress toEntity(){
        return MemberAddress.builder()
            .address(address)
            .lat(lat)
            .lon(lon)
            .build();
    }
}
