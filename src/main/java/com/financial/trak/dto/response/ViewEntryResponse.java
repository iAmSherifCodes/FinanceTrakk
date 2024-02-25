package com.financial.trak.dto.response;

import lombok.Data;

@Data
public class ViewEntryResponse {
    private String type;
    private String amount;
    private String date;
    private String category;
}
