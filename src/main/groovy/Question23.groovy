

class Question23 {

    static void main(String[] args) {

        String s="http://www.google.com?name=johny&age=20&hobby=cricket"
//        String m=s.replace("http://www.google.com?","")


        String m = s.substring(s.findIndexOf {it=='?'}+1)
        println m
        Map map=[:]
        String[] m1=m.split("&")

        m1.each() {
                String[] KeyValue=it.split("=")
                map.put(KeyValue[0],KeyValue[1])
        }
println map
    }
}
