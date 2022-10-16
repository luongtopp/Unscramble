package com.example.android.unscramble.ui.game

class MultiInit(name: String) {
    init {
        println("First initializer block that prints ${name}")
        val nums = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90,100 )
        val ascOrder = nums.sorted()
        println(ascOrder)
        val descOrder = nums.sortedDescending()
        println(descOrder)
        val numLists = listOf(70, 40, 20, 10, 30, 50, 60, 80, 90,100 )
        val outp = numLists.contains(5)
        if (outp)
            println("Your input number contains 5")
        else
            println("Your input number does not contain 5")
    }
    init {
        println("Second initializer block that prints ${name.length}")
        val HAppliance = listOf("Bed", "Pillows", "Cort", "Locker", "Travel Bag", "Wall watch", "Cleaning equipments")
        for (k in HAppliance) {
            print("$k, ")
        }
        println()
        for (i in 0 until HAppliance.size) {
            print("${HAppliance[i]} ")
        }
        println()
        HAppliance.forEachIndexed({i, j -> println("Home Appliances[$i] = $j")})
        val it: ListIterator<String> = HAppliance.listIterator()
        while (it.hasNext()) {
            val i = it.next()
            print("$i ")
        }
        println()
    }
}

