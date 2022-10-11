package nLayerOop.repository;

import nLayerOop.model.Product;

//JdbcProductDao
//Sadece db erişim kodları yazılır-> SQL
public class JdbcProductRepository implements ProductRepository{
	
	public void add(Product product) {
		System.out.println("jdbc ile veritabanına eklendi");
	}

}
