package com.course2go.model.board;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.course2go.model.comment.CommentDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private Integer bid;
    private String boardWriterUid;
    private String boardWriterNickname;
    private String boardWriterImage;
    private String boardTitle;
    private Integer boardLike;
    private Integer boardStar;
    private Integer boardTid;
    private Boolean	boardType;
    private LocalDateTime boardTime;
    public BoardDto(Board board, String boardWriterNickname, String boardWriterImage) {
    	this(board.getBid(), board.getBoardWriterUid(), boardWriterNickname, boardWriterImage, board.getBoardTitle(), board.getBoardLike(), board.getBoardStar(), board.getBoardTid(), board.getBoardType(), board.getBoardTime());
    }
}
