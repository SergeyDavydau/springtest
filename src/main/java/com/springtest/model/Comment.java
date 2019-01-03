package com.springtest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment extends BaseModel<Long> {

	@Column
	private String content;

	@Column
	private Date date;

	@ManyToOne
	private Author author;

	@ManyToOne
	private News news;

	@Column(name = "likes_count")
	private Long likesCount;

	@Column(name = "dislikes_count")
	private Long dislikesCount;

	public Long getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(Long likesCount) {
		this.likesCount = likesCount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public Long getDislikesCount() {
		return dislikesCount;
	}

	public void setDislikesCount(Long dislikesCount) {
		this.dislikesCount = dislikesCount;
	}
}
