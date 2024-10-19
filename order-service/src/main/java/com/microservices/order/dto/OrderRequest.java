package com.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode,
                           BigDecimal price, Integer quantity) { //, String email){ //UserDetails userDetails) {

  //  public record UserDetails(String email, String firstName, String lastName) {}
}
