package Concrete;

import Abstract.Entity;
import Abstract.EntityBaseRepository;

public class EntityBaseManager implements EntityBaseRepository{

	
	public void add(Entity entity) {
		System.out.println("Added to Database !");
		
	}

	@Override
	public void delete(Entity entity) {
		System.out.println("Deleted from Database !");
		
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Update to Database !");	
	}

}
