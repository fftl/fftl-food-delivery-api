package fftl.fooddeliveryapi.address.service;

import fftl.fooddeliveryapi.address.dto.SaveStoreAddressRequest;
import fftl.fooddeliveryapi.address.entity.StoreAddress;
import fftl.fooddeliveryapi.address.repository.StoreAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StoreAddressService {

    private final StoreAddressRepository storeAddressRepository;

    //매장 주소 등록
    public StoreAddress saveStoreAddress(SaveStoreAddressRequest saveStoreAddressRequest){
        return storeAddressRepository.save(saveStoreAddressRequest.toEntity());
    }

    //매장 주소 조회
    public StoreAddress findOneStoreAddress(Long storeAddressId){
        return storeAddressRepository.findById(storeAddressId).orElseThrow(()->new RuntimeException("해당 주소를 찾을 수 없습니다."));
    }

    //매장 주소 삭제
    public void deleteStoreAddress(Long storeAddressId){
        StoreAddress storeAddress = storeAddressRepository.findById(storeAddressId).orElseThrow(() -> new RuntimeException("해당 주소를 찾을 수 없습니다."));
        storeAddressRepository.delete(storeAddress);
    }

}
