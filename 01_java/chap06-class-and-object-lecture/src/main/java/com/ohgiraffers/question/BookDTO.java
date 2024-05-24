package main.java.com.ohgiraffers.question;

public class BookDTO {

    private String name;
    private String type;
    private String writer;
    private int price;
    private double discount;

    public BookDTO() {
    }

    public BookDTO(String name, String type, String writer) {
        this.name = name;
        this.type = type;
        this.writer = writer;
    }

    public BookDTO(String name, String type, String writer, int price, double discount) {
        this.name = name;
        this.type = type;
        this.writer = writer;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
