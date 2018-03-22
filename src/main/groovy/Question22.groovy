class Question22
{
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

        println list.groupBy {
            it.salary > 5000
        }




        Map<Integer, List> map1 =list.groupBy {
            it.departmentNumber
        }

        map1.each {
            print("dept = " + it.getKey())
            println(" number of employee " + it.getValue().size())
        }


        List<Employee> age = []
        Map map3=list.groupBy {
            it.age > 18 && it.age < 35
        }.each {
            age.add(it.value)
        }
        println(age.name)

        println map3

Map map4= list.groupBy {
 it.name.startsWith("s")
 }
println map4


      Map map5=  println list.groupBy {
            it.departmentNumber
        }

        println map5

    }
}
