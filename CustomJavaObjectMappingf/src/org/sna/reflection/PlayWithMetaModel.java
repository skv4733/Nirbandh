package org.sna.reflection;

import java.util.List;

import org.sna.model.Person;
import org.sna.reflection.util.ColumnField;
import org.sna.reflection.util.Metamodel;
import org.sna.reflection.util.PrimaryKeyField;

public class PlayWithMetaModel
	{
		public static void main(String[] args)
			{
				Metamodel<Person> metamodel = Metamodel.of(Person.class);

				PrimaryKeyField primaryKeyFiled = metamodel.getPrimaykey();
				List<ColumnField> columnFields = metamodel.getColumns();
				System.out.println("Primary key name = " + primaryKeyFiled.getName() + ", type = "
						+ primaryKeyFiled.getType().getSimpleName());

			
			for (ColumnField columnField : columnFields) {
				System.out.println("Column fields name = "+columnField.getName()+" , type = "+columnField.getType().getSimpleName());
			}
				
			
			}
	}
