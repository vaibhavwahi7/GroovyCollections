class Stack {

    static void main(String[] args) {
    List list=[1,2,3,4,5,6,7,8,9,10]
        list.pop()
        println list

        list.push("first")
        println list

        println list[0]
        println list.get(list.size()-1)
    }
}
