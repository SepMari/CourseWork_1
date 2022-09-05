import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee ivanov = new Employee("Ivanov Ivan Petrovich", 1, 50_000);
        Employee sidorov = new Employee("Sidorov Ivan Petrovich", 2, 80_000);
        Employee petrova = new Employee("Petrova Inna Ivanovna", 3, 130_000);

        employees[0] = ivanov;
        employees[1] = sidorov;
        employees[2] = petrova;


    }

    public static void allEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void allFullName() {
        for (Employee fullName : employees) {
            System.out.println(fullName.getFullName());
        }
    }

    public static int allSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int minSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int mediumSalary() {
        double mediumSalary = 0;
        for (Employee employee : employees) {
            mediumSalary += (double) employee.getSalary();
        }
        mediumSalary = mediumSalary / employees.length;
        return (int) mediumSalary;
    }


}


/*
1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
Отделы для простоты должны быть названы от 1 до 5.
2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем
(включая id, который нужно получить из счетчика).
7. Создать внутри класса с методом main поле типа Employee[10],
которое будет выполнять роль «хранилища» для записей о сотрудниках.
8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    2. Посчитать сумму затрат на зарплаты в месяц.
    3. Найти сотрудника с минимальной зарплатой.
    4. Найти сотрудника с максимальной зарплатой.
    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    - **Критерии оценки**
        – Корректно создан класс Employee.
        –Реализованы геттеры для всех полей класса.
        – Реализованы сеттеры для всех полей класса.
        – Создано поле типа Employee[10] для хранения записей о сотрудниках.

     Созданы методы, которые корректно выводят информацию:
        - список всех сотрудников со всеми данными,
        - поиск сотрудника с минимальной зарплатой,
        - поиск сотрудника с максимальной зарплатой,
        - подсчет среднего значения зарплат,
        - список Ф. И. О. всех сотрудников.

        – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.
 */