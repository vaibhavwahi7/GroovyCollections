class Question6 {
    static void main(String[] args) {
        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10]
def i=0
        list.each {
            println list[i].getClass()
       i++
        }
    }
}