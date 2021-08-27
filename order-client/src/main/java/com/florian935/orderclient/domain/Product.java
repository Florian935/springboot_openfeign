package com.florian935.orderclient.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = PRIVATE)
@Builder
public class Product {

    Integer id;
    String label;
    Double price;
}
