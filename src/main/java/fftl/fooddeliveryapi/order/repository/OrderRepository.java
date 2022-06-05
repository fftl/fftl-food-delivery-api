package fftl.fooddeliveryapi.order.repository;

import fftl.fooddeliveryapi.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
