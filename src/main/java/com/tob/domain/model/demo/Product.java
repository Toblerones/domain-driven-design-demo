package com.tob.domain.model.demo;

public class Product {
	private String name;
	private RecognitionStrategy recognitionStrategy;
	public Product(String name, RecognitionStrategy recognitionStrategy) {
		super();
		this.name = name;
		this.recognitionStrategy = recognitionStrategy;
	}
	
	public static Product newApple(String name){
		return new Product(name, new InstallmentRecognitionStrategy(180,360));
	}
	
	public static Product newSamsung(String name){
		return new Product(name, new InstallmentRecognitionStrategy(60,180));
	}
	
	public static Product newXiaoMi(String name){
		return new Product(name, new CompleteRecognitionStrategy());
	}
}
