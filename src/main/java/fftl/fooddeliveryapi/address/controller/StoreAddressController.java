package fftl.fooddeliveryapi.address.controller;

import fftl.fooddeliveryapi.address.service.StoreAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StoreAddressController {

    private final StoreAddressService storeAddressService;

}
