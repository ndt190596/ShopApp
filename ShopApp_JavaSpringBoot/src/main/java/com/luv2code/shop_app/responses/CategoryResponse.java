package com.luv2code.shop_app.responses;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.luv2code.shop_app.models.Category;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("category")
    private Category category;
}

