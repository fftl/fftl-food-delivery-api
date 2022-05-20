package fftl.fooddeliveryapi.address.service;

import fftl.fooddeliveryapi.address.dto.SaveMemberAddressRequest;
import fftl.fooddeliveryapi.address.entity.MemberAddress;
import fftl.fooddeliveryapi.address.repository.MemberAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberAddressService {

    private final MemberAddressRepository memberAddressRepository;

    //매장 주소 등록
    public MemberAddress saveMemberAddress(SaveMemberAddressRequest saveMemberAddressRequest){
        return memberAddressRepository.save(saveMemberAddressRequest.toEntity());
    }

    //매장 주소 조회
    public MemberAddress findOneMemberAddress(Long memberAddressId){
        return memberAddressRepository.findById(MemberAddressId).orElseThrow(()->new RuntimeException("해당 주소를 찾을 수 없습니다."));
    }

    //매장 주소 삭제
    public void deleteMemberAddress(Long MemberAddressId){
        MemberAddress MemberAddress = memberAddressRepository.findById(MemberAddressId).orElseThrow(() -> new RuntimeException("해당 주소를 찾을 수 없습니다."));
        memberAddressRepository.delete(MemberAddress);
    }
    
}
