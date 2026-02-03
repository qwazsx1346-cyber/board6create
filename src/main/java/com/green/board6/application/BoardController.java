package com.green.board6.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 빈 등록, JSON응답할거냐~
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
}
