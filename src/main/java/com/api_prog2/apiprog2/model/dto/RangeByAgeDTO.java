package com.api_prog2.apiprog2.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RangeByAgeDTO {
    private int rangeStart;
    private int rangeEnd;
    private int quantity;
}
