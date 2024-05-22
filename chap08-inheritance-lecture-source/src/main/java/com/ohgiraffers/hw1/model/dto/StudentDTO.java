package main.java.com.ohgiraffers.hw1.model.dto;

import main.java.com.ohgiraffers.hw1.model.dto.PersonDTO;

public class StudentDTO extends PersonDTO {

    //StudentDTO
    //필드값 : 학년 전공
    //grade , major
    //name 은 부모 필드에서 직접 접근해서 초기화
    private String name;
    private int grade;
    private String major;


    //생성자
    //기본생성자
    public StudentDTO() {
    }


    //매개변수 생성자
    public StudentDTO(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }


    //age, height, weight 는 부모 생성자를 통해 초기화 : super()
    public StudentDTO(int age, double height, double weight, String name) {
        super(age, height, weight);
        this.name = name;
        }



    //getter

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }


    //setter

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }



}
