package Concrete;

import Abstract.EntityBaseRepository;

public class EntityBaseManager<T> implements EntityBaseRepository<T>{

	
	public void add(T entity) {
		System.out.println("Added to Database !");
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("Deleted from Database !");
		
	}

	@Override
	public void update(T entity) {
		System.out.println("Update to Database !");	
	}

}
