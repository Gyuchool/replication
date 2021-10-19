package com.db.replication.service;

import com.db.replication.Board;
import com.db.replication.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
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