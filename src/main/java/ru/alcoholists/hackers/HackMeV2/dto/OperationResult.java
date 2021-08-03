package ru.alcoholists.hackers.HackMeV2.dto;

import lombok.Value;

@Value
public class OperationResult<T> {
    String message;
    T payload;
}
