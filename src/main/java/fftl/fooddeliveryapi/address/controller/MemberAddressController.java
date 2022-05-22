package fftl.fooddeliveryapi.address.controller;

import fftl.fooddeliveryapi.address.dto.SaveMemberAddressRequest;
import fftl.fooddeliveryapi.address.entity.MemberAddress;
import fftl.fooddeliveryapi.address.service.MemberAddressService;
import fftl.fooddeliveryapi.config.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/memberAddress")
@RestController
public class MemberAddressController {

    private final MemberAddressService memberAddressService;

    @PostMapping
    public Response saveMemberAddress(@RequestBody SaveMemberAddressRequest saveMemberAddressRequest){
        MemberAddress memberAddress = memberAddressService.saveMemberAddress(saveMemberAddressRequest);
        return new Response(true, null, memberAddress);
    }

    @GetMapping("/{memberAddressId}")
    public Response findOneMemberAddress(@PathVariable Long memberAddressId){
        MemberAddress memberAddress = memberAddressService.findOneMemberAddress(memberAddressId);
        return new Response(true, null, memberAddress)
    }


}
