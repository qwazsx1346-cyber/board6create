package com.green.board6.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //ToString 메소드를 오버라이딩(재정의 하는것) 오브젝트가 ToString가지고있음
public class BoardPostReq {
    //글 등록 때 필요한 데이터 board테이블 보고 작성
    private String title; //public을 주는 건 값이 상수일때만 주고 이외에는 모두 private로 준다.
    private String contents;    //public을 주면 은닉화가 깨져버림.
}
