package com.api_prog2.apiprog2.model.dto;

import com.api_prog2.apiprog2.model.Kid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KidByPositionDTO {
    private int position;
    private Kid kid;
}
