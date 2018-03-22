class Question1 {
     static void main(String[] args) {


        List list = []
        list[11] = "element"
        println list[11]
        println list.get(5)
        println list
        Range range = 1..10
        list = range

        println list

         list.each {
         if(it%2==0)
         {
            println it
         }
}

    }
}