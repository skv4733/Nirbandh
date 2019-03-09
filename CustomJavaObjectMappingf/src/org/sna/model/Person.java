package org.sna.model;

import org.sna.model.annotation.Column;
import org.sna.model.annotation.PrimaryKey;

public class Person
	{
		@PrimaryKey
		private long id;

		@Column
		private String name;
		@Column
		private int age;

		public Person()
			{
				super();
				// TODO Auto-generated constructor stub
			}

		public Person(String name, int age)
			{
				this.name = name;
				this.age = age;
			}

		public static Person of(String name, int age)
			{
				return new Person(name, age);
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getAge()
			{
				return age;
			}

		public void setAge(int age)
			{
				this.age = age;
			}

		public long getId()
			{
				return id;
			}

		public void setId(int id)
			{
				this.id = id;
			}

		@Override
		public String toString()
			{
				return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
			}
		
		
	}
