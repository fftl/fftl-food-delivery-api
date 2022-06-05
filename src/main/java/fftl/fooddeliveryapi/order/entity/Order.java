package fftl.fooddeliveryapi.order.entity;

import fftl.fooddeliveryapi.menu.entity.Menu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column
    private Long orderStoreKey;

    @Column
    private Long amount;

    @OneToMany
    private List<Menu> menuList = new ArrayList<>();

}
