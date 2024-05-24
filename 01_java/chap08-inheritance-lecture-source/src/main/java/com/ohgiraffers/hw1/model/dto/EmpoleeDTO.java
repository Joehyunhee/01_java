package main.java.com.ohgiraffers.hw1.model.dto;

import main.java.com.ohgiraffers.hw1.model.dto.PersonDTO;

public class EmpoleeDTO extends PersonDTO {

    //필드

    //급여, 부서
    //salary, debt
    private int salary;
    private String debt;


    //기본생성자
    public EmpoleeDTO() {
    }

    //매개변수 생성자
    public EmpoleeDTO(int salary, String debt) {
        this.salary = salary;
        this.debt = debt;
    }

    //age, height, weight 는 부모 생성자를 통해 초기화 : super()
    public EmpoleeDTO (int age, double height, double weight, String name){
        super(age, height, weight);
        //name 은 부모 필드에서 직접 접근해서 초기화
        super.setName(name);


    }

    //getter

    public int getSalary() {
        return salary;
    }

    public String getDebt() {
        return debt;
    }


    //setter

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }
}
