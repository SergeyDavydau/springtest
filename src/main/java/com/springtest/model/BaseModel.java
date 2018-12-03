package com.springtest.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseModel<ID extends Serializable> implements Cloneable {	//так как id содержится во всех моделях, выносим отдельный класс (!!!не entity!!!) от которго будем наследоваться

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
}
