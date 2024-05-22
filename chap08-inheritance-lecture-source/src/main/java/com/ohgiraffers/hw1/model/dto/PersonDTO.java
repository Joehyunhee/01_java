package main.java.com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    //PersonDTO

    //필드값 : 이름,나이,신장,몸무게 //공통
    //name,age,height,weight,
    private String name;
    private int age;
    private double height;
    private double weight;

    //기본생성자
    //personDTO()
   public PersonDTO() {}

    //PersonDTO(매개변수: age, height, weight)
    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    //setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //infomation() string
    public String getInfo(){
        return "Person > " + "학생나이는 : " + age
                + "학생키는 : " + height + "학생몸무게는 :" + weight;
        }




    }

















