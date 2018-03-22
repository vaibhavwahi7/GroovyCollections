class Question9 {

    static void main(String[] args) {

        String s = "this string needs to be split"

        println s.tokenize(" ")
        println s.tokenize()
        println s.tokenize(/\s/)

        println s.split(" ")
        println s.split(/\s/)


    }
}