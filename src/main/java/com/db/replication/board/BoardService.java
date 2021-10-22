package com.db.replication.board;

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

    public void add(Dto dto){
        Board board = new Board();
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());
        boardRepository.save(board);
    }
}