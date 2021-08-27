package com.florian935.orderserver;

import com.florian935.orderserver.domain.Product;
import com.florian935.orderserver.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static lombok.AccessLevel.PRIVATE;

@SpringBootApplication
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class OrderServerApplication {

	ProductRepository productRepository;
	Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	void initData() {
//
//		productRepository.saveAll(generateRandomProduct());
//	}
//
//	private List<Product> generateRandomProduct() {
//
//		final List<Product> products = new ArrayList<>();
//
//		for (int i = 1; i <= 50; i++) {
//
//			double price = ThreadLocalRandom.current().nextDouble(20, 200);
//			products.add(new Product(i, getRandomLabel(), price));
//		}
//
//		return products;
//	}
//
//	private String getRandomLabel() {
//
//		final List<String> labels = List.of("Jean", "T-shirt", "Pull", "Sweat", "Short", "Sockets", "Shoes");
//
//		return labels.get(random.nextInt(labels.size()));
//	}
}
