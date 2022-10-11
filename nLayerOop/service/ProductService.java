package nLayerOop.service;

import java.util.List;

import nLayerOop.core.loging.Logger;
import nLayerOop.model.Product;
import nLayerOop.repository.JdbcProductRepository;
import nLayerOop.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository productRepository;
	private List<Logger> loggers;
	
	public ProductService(ProductRepository productRepository,List<Logger> loggers) {
		this.productRepository = productRepository;
		this.loggers=loggers;
	}



	//throw -> Bu metodu çağırdığın zaman böyle bir hata fırlatılabilir.
	public void add(Product product) throws Exception {
		if(product.getUnitPrice() < 10)
			throw new Exception("Ürün fiyatı 10 dan düşük olamaz.");
		
		productRepository.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}

}
