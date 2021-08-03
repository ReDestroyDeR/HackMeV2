package ru.alcoholists.hackers.HackMeV2.model.net;


import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class Port {
    @Min(0)
    @Max(2 << 16)
    private final int port;

    private boolean available;
}
