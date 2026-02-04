package com.green.board6.application.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //여기서는 굳이 없어도 되지만 안정성을위해 넣어줌 mybtis가 private인데도 불구하고 값을빼서 넣어줌
public class BoardGetRes {
    private int id;
    private String title;
    private String createdAt;
}
