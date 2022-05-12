package fftl.fooddeliveryapi.address.repository;

import fftl.fooddeliveryapi.address.entity.MemberAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAddressRepository extends JpaRepository<MemberAddress, Long> {
}
