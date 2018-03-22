class Question14 {

    static void main(String[] args) {
        def list= 1..100
        def i = 0
        list.each {
            if((it%3==0)&&(it%5!=0))
        {

            println "Fizz"
        }
            else
                if((it%5==0)&&(it%3!=0))
                {
                    println "Buzz"
                }
            else
                    if((it%3==0)&&(it%5==0))
                    {
                        println "FizzBuzz"
                    }
            else
                    {
                        println it
                    }

        }




    }
}