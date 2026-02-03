package com.green.board6.application;

import com.green.board6.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //spring log for j
@RestController // 빈 등록, JSON응답할거냐~
@RequiredArgsConstructor
@RequestMapping("api/board")
public class BoardController {

    //BoardService 빈 주소값을 DI 받아주세요.
    private final BoardService boardService;

    // /board post 방식으로 JSON은 BoardPostReq로 받을 수 있도록 메소드 만들기. 리턴타입은 int
    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        log.info("p: {}", p); //어느메소드에서 실행된지도 같이 찍힘
        return boardService.save(p);
    }

}
