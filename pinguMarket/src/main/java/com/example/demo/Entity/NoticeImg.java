package com.example.demo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notice_img")
public class NoticeImg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noticeImgId;
	
	@ManyToOne
	@JoinColumn(name = "notice_id")
	private Notice notice;
	
	@ManyToOne
	@JoinColumn(name = "image_id")
	private Image image;

}
