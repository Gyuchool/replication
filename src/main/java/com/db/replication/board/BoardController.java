package com.db.replication.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/replication/readonly")
    public List<Board> readonlyTransaction() {
        return boardService.updateTitle();
    }

    @GetMapping("/replication/nreadonly")
    public List<Board> nreadonlyTransaction() {
        return boardService.getBoardList();
    }

    @PostMapping("/add")
    public void addBoard(@RequestBody Dto dto){
        boardService.add(dto);
    }

}