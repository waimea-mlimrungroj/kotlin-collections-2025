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
    println(snacks)

    // get a random
    val item = snacks.random()
    println(item)

    // loop throung the list
    for (snacks in snacks) {
        println(snacks)

    }
}

