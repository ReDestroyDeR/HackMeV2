package ru.alcoholists.hackers.HackMeV2.model;


import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Value
public class Port {
    @Min(0)
    @Max(2 << 16)
    int port;
}
