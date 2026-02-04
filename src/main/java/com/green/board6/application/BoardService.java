package com.green.board6.application;

import com.green.board6.application.model.BoardGetRes;
import com.green.board6.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //빈 등록
@RequiredArgsConstructor // final인 멤버필드를 DI받는 생성자를 만든다.
//@AllArgsConstructor => 모든 멤버필드를 DI받는 생성자를 만든다.
public class BoardService {
    private final BoardMapper boardMapper;

    public int save(BoardPostReq req) {
        return boardMapper.save(req);
    }

    public List<BoardGetRes> findAll(String searchText) {
        return boardMapper.findAll(searchText);
    }
}
