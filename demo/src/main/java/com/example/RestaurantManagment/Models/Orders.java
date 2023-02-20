package com.example.RestaurantManagment.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

     private String OrderNote ;

    private Long orderId ;
    private  Float total;


    @OneToMany(mappedBy = "orders")
    private List<OrderDetails> orderDetail;



    public  Orders() {}


    public Orders(float total , String OrderNote )
    {
        this.total=total;
        this.OrderNote=OrderNote;
        this.orderId=orderId;


    }

    public long getOrderID(){
        return  orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId=orderId;
    }

    





}
