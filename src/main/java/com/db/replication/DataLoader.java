//package com.db.replication;
//
//import com.db.replication.board.Board;
//import com.db.replication.board.BoardRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    private final BoardRepository boardRepository;
//
//    public DataLoader(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        List<Board> boards = new ArrayList<>();
//        for (int i = 1; i < 10; i++) {
//            Board board = new Board();
//            board.setTitle("제목" + i);
//            board.setContent("내용" + i);
//            boards.add(board);
//        }
//        boardRepository.saveAll(boards);
//    }
//}
