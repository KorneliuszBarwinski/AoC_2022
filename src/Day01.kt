fun main() {
    fun getTotalCaloriesInEachBackpack(input: String) = input.split("\r\n\r\n").map { backpack ->
        backpack.split("\r\n").sumOf { it.toInt() }
    }

    fun part1(input: String): Int {
        val backpacks = getTotalCaloriesInEachBackpack(input)
        return backpacks.max()
    }

    fun part2(input: String): Int {
        val backpacks = getTotalCaloriesInEachBackpack(input)
        return backpacks.sortedDescending().subList(0, 3).sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

