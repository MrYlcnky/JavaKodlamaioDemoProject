package JavaKodlamaioDemoProject.business;

import java.util.ArrayList;
import java.util.List;

import JavaKodlamaioDemoProject.core.logging.Logger;
import JavaKodlamaioDemoProject.dataAccess.CategoryDao;
import JavaKodlamaioDemoProject.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	

	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}

	//İş koşulları:kategori ismi tekrar edemez
	List<Category> categories=new ArrayList<>();
	
	public void addCategory(Category category) throws Exception{
		
		for (Category categories : categories) {
			if (categories.getCategoryName().toUpperCase().equals(category.getCategoryName().toUpperCase())==true) {
				throw new Exception("Böyle Bir Kategori Var Ekleyemezsin!!!");
			}
		}
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
	public void deleteCategory(Category category) throws Exception{
		
		for (Category categories : categories) {
			if (categories.getCategoryName().toUpperCase().equals(category.getCategoryName().toUpperCase())==false) {
				throw new Exception("Böyle Bir Kategori Yok Silemezsin!!!");
			}
		}
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
