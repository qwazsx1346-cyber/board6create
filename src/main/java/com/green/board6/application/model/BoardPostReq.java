package com.green.board6.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //ToString 메소드를 오버라이딩(재정의 하는것) 오브젝트가 ToString가지고있음
public class BoardPostReq {
    //글 등록 때 필요한 데이터 board테이블 보고 작성
    private String title;
    private String contents;
}
