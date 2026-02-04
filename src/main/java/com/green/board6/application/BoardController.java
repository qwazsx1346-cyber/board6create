package com.green.board6.application;

import com.green.board6.application.model.BoardGetOneRes;
import com.green.board6.application.model.BoardGetRes;
import com.green.board6.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //이 친구 리턴 타입은 BoardGetRes객체를 여러개 리턴할 수 있어야 한다.
    //배열 출력이(게시판리스트가) 두줄이상출력이 목적이면 무조건 List<>로 해줘야함
    //파라미터안에 RequestParam 애노테이션을 안적어줘도 자동으로 붙여줌
    //required=false를 해주면 값을 보낼수도있고 안보낼수도있고 라는 뜻(RequestParam 애노테이션 문법)
    @GetMapping
    public List<BoardGetRes> getBoardList(@RequestParam(name="search_text",required=false) String searchText) {
        log.info("searchText: {}", searchText);
        return boardService.findAll(searchText);
    }

    @GetMapping("{id}")
    public BoardGetOneRes getBoard(@PathVariable int id) {
        log.info("id: {}", id);
        return boardService.findById(id);
    }

}
