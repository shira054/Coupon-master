package com.example.Coupon.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Coupon {
    //פה בשכבת המודל בונים את המחלקות שעל פיהם רוצים ליצור את הטבלאות שלנו
    @Id
    @GeneratedValue
    private int coupon_id;
    private int companyId;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private int amount;
    private double price;
    private String image;

    public int getCoupon_id() {
        return this.coupon_id;
    }

    public int getCompany_id() {
        return this.companyId;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public String getImage() {
        return this.image;
    }

    public Coupon() {
    }

    public Coupon(int coupon_id, int company_id, Category category, String title, String description, LocalDate startDate, LocalDate endDate, int amount, double price, String image) {
        this.coupon_id = coupon_id;
        this.companyId = company_id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.price = price;
        this.image = image;
    }

    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public void setCompany_id(int company_id) {
        this.companyId = company_id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String toString() {
        return "Coupon{coupon_id=" + this.coupon_id + ", company_id=" + this.companyId + ", category=" + this.category + ", title='" + this.title + "', description='" + this.description + "', startDate=" + this.startDate + ", endDate=" + this.endDate + ", amount=" + this.amount + ", price=" + this.price + ", image='" + this.image + "'}";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
