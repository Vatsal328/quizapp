package com.vatsal.quizapp.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
}
