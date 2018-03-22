class Question5 {

    static void main(String[] args) {

        List list = [1, 2, 3,3, 4, 5]
        list.removeAll
                {
            it % 2 == 0

        }
        println list


    }
}