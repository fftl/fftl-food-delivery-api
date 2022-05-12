package fftl.fooddeliveryapi.address.repository;

import fftl.fooddeliveryapi.address.entity.StoreAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreAddressRepository extends JpaRepository<StoreAddress, Long> {
}
