package com.green.board6.application;

import com.green.board6.application.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int save(BoardPostReq req);
}
