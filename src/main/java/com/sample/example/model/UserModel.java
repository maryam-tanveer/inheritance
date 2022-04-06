package com.sample.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {

    private String name;
    private String email;
    private String address;
    private String phone;
}
