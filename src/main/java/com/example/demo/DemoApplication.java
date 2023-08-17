package com.example.demo;

import com.example.demo.entity.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(value = "/items")
	public List<Item> getItems() {
		List<Item> items = new ArrayList<>();

		// Add sample data
		items.add(new Item(1L, "Item 1"));
		items.add(new Item(2L, "Item 2"));
		items.add(new Item(3L, "Item 3"));

		return items;
	}
}
