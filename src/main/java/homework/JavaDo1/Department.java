package homework;

import java.util.ArrayList;
import java.util.List;

// Person 클래스: 고객과 직원 클래스의 상위 클래스
class Person {
    private String name; // 이름 필드

    public Person(String name) { // 생성자
        this.name = name;
    }

    public String getName() { // 이름을 반환하는 메소드
        return name;
    }
}

// Customer 클래스: 고객 클래스
class Customer extends Person {
    private int allMoney; //

    public Customer(String name) { // 생성자
        super(name);
    }

    public int buy(int price) { // 상품 구매 메소드
        allMoney = allMoney + price;
        return allMoney;
    }

    // 메소드 오버로딩
    public int buy(int price, int quantity) {
        allMoney = allMoney + price * quantity;
        return allMoney;
    }
}

// Employee 클래스: 직원 클래스
class Employee extends Person {
    private int salary; // 급여 필드

    public Employee(String name, int salary) { // 생성자
        super(name);
        this.salary = salary;
    }

    public int getSalary() { // 급여를 반환하는 메소드
        return salary;
    }

    public void raiseSalary(int amount) { // 급여 인상 메소드
        salary += amount;
    }

    // 메소드 오버라이딩
    @Override
    public String getName() { // 이름을 반환하는 메소드를 오버라이딩하여 "Employee 이름:" 형식으로 반환
        return "Employee 이름: " + super.getName();
    }
}


public class Department {
    private String name;
    private String managerName;

    public Department(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return managerName;
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Manager: " + managerName;
    }
}

class Store {
    private String name;
    private String location;
    private List<Department> departments;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}
