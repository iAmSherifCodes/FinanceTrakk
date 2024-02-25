package com.financial.trak.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class AddEntryRequest {
    private String type;
    private String amount;
    private String date;
    private String category;
}
