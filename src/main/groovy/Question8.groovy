class Question8 {

    static void main(String[] args) {

        Employee employee1=new Employee("vaibhav",24,2736,1234,5000)
        Employee employee2=new Employee("Vedant",23,3828,2332,5000)
        Employee employee3=new Employee("Vistaar",21,2736,2372,20000)
        Employee employee4=new Employee("Harsh",22,3723,3732,4000)
        Employee employee5=new Employee("Narendar",25,3238,3323,5000)

        List<Employee> list=[]
        list.add(employee1)
        list.add(employee2)
        list.add(employee3)
        list.add(employee4)
        list.add(employee5)

list.sort{
    it.age
}
        list.each{

            if(it.Salary>5000)
            {
               println it
            }

}
        println "Youngest Employee is " +list.name[0]
        println "Oldest Employee is " +list.name[list.size()-1]

        list.sort{it.salary}
        println "Employee with the maximum salary is " +list.name[list.size()-1]



    }

}
