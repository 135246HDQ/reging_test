package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String sender;
    private String address;
    private String title;
    private Date senddate;
    private String top;
}
