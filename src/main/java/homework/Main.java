package homework;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("박준하");
        System.out.println(customer1.getName() + "님이 " + customer1.buy(100) + "만원 어치 상품을 구매했습니다.");
        System.out.println(customer1.getName() + "님이 " + "오늘 총 " + customer1.buy(200) + "만원을 구매했습니다");
        Employee employee1 = new Employee("도원준", 200);
        System.out.println(employee1.getName() + " 직원님은 한 달에 " + employee1.getSalary() + " 만원을 받습니다.");
        employee1.raiseSalary(500);
        System.out.println(employee1.getName() + " 직원님의 급여가 한 달에 " + employee1.getSalary() + " 만원으로 인상되었습니다.");

        Department department1 = new Department("패션", "장지성");
        System.out.println(department1.getName() + " 부서의 매니저는 " + department1.getManagerName() + "님 입니다.");

        Store store1 = new Store("나이키", "서울");
        store1.addDepartment(department1);
        System.out.println(store1.getDepartments());
        System.out.println(store1.getName() + " 상점은 " + store1.getLocation() + "에 위치해있습니다.");
    }
}
