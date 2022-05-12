package fftl.fooddeliveryapi.address.service;

import fftl.fooddeliveryapi.address.repository.MemberAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberAddressService {

    private final MemberAddressRepository memberAddressRepository;

}
