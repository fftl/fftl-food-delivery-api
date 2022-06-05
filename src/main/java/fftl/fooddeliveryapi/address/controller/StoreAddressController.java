package fftl.fooddeliveryapi.address.controller;

import fftl.fooddeliveryapi.address.dto.SaveStoreAddressRequest;
import fftl.fooddeliveryapi.address.entity.StoreAddress;
import fftl.fooddeliveryapi.address.service.StoreAddressService;
import fftl.fooddeliveryapi.config.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/storeAddress")
@RestController
public class StoreAddressController {

    private final StoreAddressService storeAddressService;

    @PostMapping
    public Response saveStoreAddress(@RequestBody SaveStoreAddressRequest saveStoreAddressRequest){
        StoreAddress storeAddress = storeAddressService.saveStoreAddress(saveStoreAddressRequest);
        return new Response(true, null, storeAddress);
    }

    @GetMapping("/{storeAddressId}")
    public Response findOneStoreAddress(@PathVariable Long storeAddressId){
        StoreAddress storeAddress = storeAddressService.findOneStoreAddress(storeAddressId);
        return new Response(true, null, storeAddress);
    }

    @DeleteMapping("/{storeAddressId")
    public Response deleteStoreAddress(@PathVariable Long storeAddressId){
        storeAddressService.deleteStoreAddress(storeAddressId);
        return new Response(true, null, null);
    }
}
