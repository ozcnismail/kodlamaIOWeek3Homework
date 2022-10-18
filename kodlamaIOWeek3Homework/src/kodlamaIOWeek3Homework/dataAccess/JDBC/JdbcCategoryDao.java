package kodlamaIOWeek3Homework.dataAccess.JDBC;

import kodlamaIOWeek3Homework.dataAccess.Interface.CategoryDao;
import kodlamaIOWeek3Homework.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void categoryAdd(Category category) {

		System.out.println("JDBC olarak Veri tabanına kategori eklendi.");
	}

}
