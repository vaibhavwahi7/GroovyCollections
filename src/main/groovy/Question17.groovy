class Question17 {

    static void main(String[] args) {

        Map<String,Integer> map=new HashMap<String,Integer>()

        map.put("Vaibhav",23)
        map.put("Vd",23)

        Map<String,Integer> map2=new HashMap<String,Integer>()

        map2.put("TTN",2018)
        map2.put("DXC",2018)

        Map<String,Integer> map3=map+map2
        println map3
    }
}
