package ru.alcoholists.hackers.HackMeV2.model.net;

import lombok.Value;

import javax.validation.constraints.Pattern;

@Value
public class Ip {
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
    String ip;
}
