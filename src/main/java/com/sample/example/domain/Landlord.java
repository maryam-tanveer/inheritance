package com.sample.example.domain;

import lombok.*;
import oadd.org.joda.time.DateTime;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Landlord extends User {
    private UUID id;

    private DateTime signUpDate;

    private String status;

    public Landlord(DateTime signUpDate, String status) {
        super();
        this.signUpDate = signUpDate;
        this.status = status;
    }
}
