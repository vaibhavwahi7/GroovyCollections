import javax.swing.table.TableModel

class Question11 {

    static void main(String[] args) {
        def i = 5
        def j=1
        println "table of "+i+" is"
        10.times {
            println j*i
            j++
        }
    }
}
