package fftl.fooddeliveryapi.address.controller;

import fftl.fooddeliveryapi.address.service.MemberAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberAddressController {

    private final MemberAddressService memberAddressService;
}
