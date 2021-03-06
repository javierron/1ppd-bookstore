package com.oneppd.repository;

import com.oneppd.repository.memory.AddressRepository;
import com.oneppd.repository.memory.AuthorRepository;
import com.oneppd.repository.memory.BookHasAuthorRepository;
import com.oneppd.repository.memory.BookRepository;
import com.oneppd.repository.memory.CatalogRepository;
import com.oneppd.repository.memory.CreditCardRepository;
import com.oneppd.repository.memory.CustomerRepository;
import com.oneppd.repository.memory.ItemRepository;
import com.oneppd.repository.memory.OrderRepository;
import com.oneppd.repository.memory.PriceRepository;
import com.oneppd.repository.memory.ShoppingCartRepository;

public abstract class BookstoreConcreteRepository {
	
	
	public abstract BookRepository getBookRepository();

	public abstract AuthorRepository getAuthorRepository();

	public abstract BookHasAuthorRepository getBookHasAuthorRepository();

	public abstract CustomerRepository getCustomerRepository();

	public abstract ItemRepository getItemRepository();

	public abstract ShoppingCartRepository getShoppingCartRepository();

	public abstract PriceRepository getPriceRepository();

	public abstract CatalogRepository getCatalogRepository();
	
	public abstract AddressRepository getAddressRepository();
	
	public abstract CreditCardRepository getCreditCardRepository();
	
	public abstract OrderRepository getOrderRepository();
	
}
