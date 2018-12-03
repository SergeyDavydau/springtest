package com.springtest.model;

import javax.persistence.*;

@Entity
@Table
public class News extends BaseModel<Long> {	//наследуем от класса содержащего в себе Id

	@Column
	private String title;

	@Column
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
