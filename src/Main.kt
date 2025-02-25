/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList!")
    println()

    // Create our list
    val snacks = mutableListOf<String>()

    //Show it
    println(snacks)

    // Add in somme things...
    snacks.add("Seaweed")
    snacks.add("Pringles")
    snacks.add("Lays")

    println(snacks)

    // Show specific item
    println(snacks[0])
    // prinlin(snacks[3]) would be out of bound

    // Change value
    snacks[1] = "Pockey"

    println(snacks)

    // Remove an item
    snacks.removeAt(0)
    println(snacks)

    // Add in new items in specific places
    snacks.add(1, " Fruit burst")

    // Sort the list
    snacks.sort()
    println("Sorted list of snack: $snacks")

    // get a random
    val item = snacks.random()
    println("Random item: $item")

    // loop throung the list
    for (snacks in snacks) {
        println("Loop: $snacks")

    }
    // loop using index
    for (i in 0 ..< snacks.size) {
        println("$i: ${snacks[i]}")
    }
    // loop getting index and values
    for ((i, snacks) in snacks.withIndex()) {
        println("$i: $snacks")
    }

    // searching for item
    println("Pockey is in list: ${snacks.contains("Pockey")}")
    println("Horse is in list: ${snacks.contains("Horse")}")


    // getting index of an item
    println("Pockey index: ${snacks.indexOf("Pockey")}")
    println("Horse index: ${snacks.indexOf("Horse")}")
}

