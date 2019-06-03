package mTrepka.libary.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by Mario on 2017-07-16.
 */
@Entity(name = "borrow_history")
@Data
public class BorrowHistory {
    @Id
    @GeneratedValue
    private long id;
	private LocalDate borrow_date;
	private LocalDate return_date;
    @ManyToOne
    @JoinColumn(name = "userborrow")
    private User userBorrow;
    @ManyToOne
    @JoinColumn(name = "bookborrow")
    private Book bookBorrow;
}
