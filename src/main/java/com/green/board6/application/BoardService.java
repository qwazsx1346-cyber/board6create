package com.green.board6.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //빈 등록
@RequiredArgsConstructor // final인 멤버필드를 DI받는 생성자를 만든다.
//@AllArgsConstructor => 모든 멤버필드를 DI받는 생성자를 만든다.
public class BoardService {
    private final BoardMapper boardMapper;
}
