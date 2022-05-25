package xyz.azgcloudev.basics

fun main() {

    // Empty array
    val arrayList = ArrayList<String>()
    arrayList.add("one")
    arrayList.add("two")
    println(arrayList)
    for (i in arrayList) {
        print("$i ")
    }

    // ArrayList using collection
    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()
    list.add("one")
    list.add("two")
    arrayList2.addAll(list)
    println("\n$arrayList2")


    // Filled elements in ArrayList using collections
    val itr = arrayList.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = " +arrayList.size)




    // ArrayList -get()
    println("The get(2) result is: ${arrayList2.get(1)}")
}