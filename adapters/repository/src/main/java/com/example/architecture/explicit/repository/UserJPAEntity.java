package com.example.architecture.explicit.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "t_user")
class UserJPAEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer age;
	private Integer gender;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UserJPAEntity userJPAEntity = (UserJPAEntity) o;
		return id != null && Objects.equals(id, userJPAEntity.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
