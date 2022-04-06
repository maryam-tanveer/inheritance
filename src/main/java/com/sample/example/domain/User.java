package com.sample.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;
    private String email;
    private String address;
    private String phone;


}
