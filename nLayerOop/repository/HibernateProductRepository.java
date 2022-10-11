package nLayerOop.repository;

import nLayerOop.model.Product;

public class HibernateProductRepository implements  ProductRepository {
	
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
