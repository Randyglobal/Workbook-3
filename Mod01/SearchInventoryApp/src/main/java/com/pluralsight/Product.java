package com.pluralsight;

public class Product {
        private String id;
        private String name;
        private float price;
        public Product(String id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public String getId() {
            return this.id;
        }
        public String getName() {
            return this.name;
        }
        public float getPrice() {
            return this.price;
        }
}

