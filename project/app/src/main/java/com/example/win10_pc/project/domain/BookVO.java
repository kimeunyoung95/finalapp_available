package com.example.win10_pc.project.domain;

/**
 * Created by win10_pc on 2017-05-28.
 */

public class BookVO {
        private String title;
        private String author;
        private String imgUrl;
    private String description;
    private String price;

    public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
               this.price = price;
            }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
}