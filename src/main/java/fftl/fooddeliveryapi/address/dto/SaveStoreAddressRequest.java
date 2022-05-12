package fftl.fooddeliveryapi.address.dto;

import fftl.fooddeliveryapi.address.entity.StoreAddress;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SaveStoreAddressRequest {

    private String address;
    private Double lat;
    private Double lon;

    public StoreAddress toEntity(){
        return StoreAddress.builder()
            .address(address)
            .lat(lat)
            .lon(lon)
            .build();
    }

}
