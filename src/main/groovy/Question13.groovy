class Question13 {
    static void main(String[] args) {
        def name = "Vaibhav"

       name.toSet().each{it
           println "Occurence of "+it+ " is" +name.count(it)}
    }
    }
