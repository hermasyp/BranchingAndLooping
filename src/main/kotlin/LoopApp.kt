import kotlin.math.max

class LoopApp {
    fun run() {
        //range 1 sampai 10
        /*
        for (i in 1..10) {
            println("Hello , this is Text number - $i")
        }
        */
        /*
        //range 10 sampai 1
        for (i in 10 downTo 1) {
            println("Hello , this is Text number - $i")
        }
        */
        /*
        for (i in 1 until 10) {
            println("Hello , this is Text number - $i")
        }*/
/*
        //nested loop
        for(i in 5 downTo 1){
            for(j in 1..i){
                print("*")
            }
            println()
        }

        */

        //val fruits = arrayOf("Apple","Pineapple","Watermelon","Durian","Grapes")
        //classic way
        /*
        for(fruit in fruits){
            println("Fruit name is = $fruit")
        }*/

        // kotlin ways
        /*
        fruits.forEach {fruit ->
            println("Fruit name is = $fruit")
        }
        fruits.forEachIndexed { index, fruit ->
            println("Fruit name with index $index is = $fruit")
        }
        */

        println("Input max data : ")
        val maxData = readLine()?.toInt() ?: 0
        val names = arrayListOf<String>()
        for (index in 1..maxData){
            println("Input name for data number $index : ")
            val name = readLine() ?: ""
            names.add(name)
        }
        println("List name is = ")
        println(names)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            LoopApp().run()
        }
    }
}