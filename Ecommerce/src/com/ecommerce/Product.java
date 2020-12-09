package com.ecommerce;

    public class Product {
        String title;
        String brand;
        double price;
        Integer ratings;

        public Product(String title, String brand, double price, Integer ratings) {
            this.title = title;
            this.brand = brand;
            this.price = price;
            this.ratings = ratings;
        }

        public Product() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Integer getRatings() {
            return ratings;
        }

        public void setRatings(Integer ratings) {
            this.ratings = ratings;
        }

}
