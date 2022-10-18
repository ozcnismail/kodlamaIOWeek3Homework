package kodlamaIOWeek3Homework.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWeek3Homework.core.logging.Logger;
import kodlamaIOWeek3Homework.dataAccess.Interface.CategoryDao;
import kodlamaIOWeek3Homework.entities.Category;
import kodlamaIOWeek3Homework.entities.Course;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void CategoryAdd(Category category) throws Exception { 

		for (Category categoryFor : categories) { 
			if (categoryFor.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Aynı isimden Kategori bulunmaktadır. Farklı bir Kategori ismi seçiniz.");
			}
		}
		 
		categoryDao.categoryAdd(category);
		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
