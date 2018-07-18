package com.servdemo.org.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Board {
	
	    private long id;
		
		
		private String boardName;
		
		public Board() {};
		
		
		private Student student;
		
		@Id @GeneratedValue
		public long getid() {
			return id;
		}
		public void setid(long id) {
			this.id = id;
		}
		public Board(String boardName) {
			
			this.boardName = boardName;
		}
		public String getBoardName() {
			return boardName;
		}
		public void setBoardName(String boardName) {
			this.boardName = boardName;
		}
		@Override
		public String toString() {
			return "Board [board_id=" + id + ", boardName=" + boardName + "]";
		}
		
		 @OneToOne( mappedBy = "board", 
				    cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		public Student getStudent() {
			return student;
		}
		public void setStudent(Student student) {
			this.student = student;
		}
		

}
