class Employee {

        String Name
        int Age
        int DepartmentNumber
        int EmployeeNumber
        int Salary

    Employee(String name,int age,int departmentNumber,int employeeNumber,int salary)
    {
        this.Name=name
        this.Age=age
        this.DepartmentNumber=departmentNumber
        this.EmployeeNumber=employeeNumber
        this.Salary=salary
    }


    @Override
    String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DepartmentNumber=" + DepartmentNumber +
                ", EmployeeNumber=" + EmployeeNumber +
                ", Salary=" + Salary +
                '}'
    }
}
