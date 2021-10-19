package com.db.replication.board.service;

import com.db.replication.board.Board;
import com.db.replication.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<Board> getBoardList(){
        return boardRepository.findAll();
    }

    public List<Board> updateTitle() {
        List<Board> boards = boardRepository.findAll();
        for (Board board : boards) {
            board.setTitle("newTitle");
        }
        return getBoardList();
    }
}