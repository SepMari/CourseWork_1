public class Employee {

    private String fullName;
    private int group;
    private int salary;
    private static int id;
    private static int count;


    public Employee(String fullName, int group, int salary) {
        this.fullName = fullName;
        this.group = group;
        this.salary = salary;
        this.id = count++;
    }


    @Override
    public String toString() {
        return "Employee {" +
                "fullName = '" + fullName + '\'' +
                ", group = " + group +
                ", salary = " + salary +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroup() {
        return group;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
