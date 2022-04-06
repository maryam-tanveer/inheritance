package com.sample.example.domain;

import lombok.*;
import oadd.org.joda.time.DateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Landlord extends User {

    private DateTime signUpDate;

    private String status;
}
