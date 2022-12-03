fun main() {

    fun convertToCodeInt(symbol: Char) : Int = if (symbol.isUpperCase()) symbol.hashCode() - 38 else symbol.hashCode() - 96


    fun part1(input: String): Int = input.split("\r\n").sumOf { rucksack ->
        val firstCompartment = rucksack.substring(0, rucksack.length / 2).toSet()
        val secondCompartment = rucksack.substring(rucksack.length / 2).toSet()
        convertToCodeInt(firstCompartment.intersect(secondCompartment).first())
    }

    fun part2(input: String): Int = input.split("\r\n").windowed(3, 3).sumOf { group ->
        val firstElve = group[0].toSet()
        val secondElve = group[1].toSet()
        val thirdElve = group[2].toSet()
        convertToCodeInt(firstElve.intersect(secondElve).intersect(thirdElve).first())
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}

