class Question21 {

    static void main(String[] args) {

    Map m = ['Computing':['Computing' : 600, 'Information Systems' : 300],
            'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management'
             : ['Management' : 800] ]

        println "Number of departments are " +m.count {it}
        println "Programs delivered by Computing Department are "
                 +m.count{
                     if(it.getKey().equals("Computing"))
                     {
                         println(it.getValue())
                     }
                 }

        println(m.Engineering)
        println "Students enrolled in Civil Engineering program are "
                m.Engineering.each{
                    if(it.getKey().equals("Civil"))
                        {
                            println(it.getValue())

                    }
                }
    }
}
