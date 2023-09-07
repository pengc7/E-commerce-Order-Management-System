package com.microservice.inventoryservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;
}
