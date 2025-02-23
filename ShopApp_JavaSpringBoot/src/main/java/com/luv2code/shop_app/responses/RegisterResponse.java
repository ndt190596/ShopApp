package com.luv2code.shop_app.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.luv2code.shop_app.models.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("user")
    private User user;
}
