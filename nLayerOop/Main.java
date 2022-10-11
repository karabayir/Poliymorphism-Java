package nLayerOop;

import java.util.ArrayList;
import java.util.List;

import nLayerOop.core.loging.DatabaseLogger;
import nLayerOop.core.loging.FileLogger;
import nLayerOop.core.loging.Logger;
import nLayerOop.core.loging.MailLogger;
import nLayerOop.model.Product;
import nLayerOop.repository.HibernateProductRepository;
import nLayerOop.service.ProductService;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1, "anker", 499);
		
		List<Logger> loggers=new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
		ProductService productService = new ProductService( new HibernateProductRepository(),loggers);
		
		productService.add(product1);
		
	}

}
