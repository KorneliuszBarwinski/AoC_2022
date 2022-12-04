fun main() {

    fun calculateRanges(input: String) = input.split("\r\n").map { element ->
        element.split(",").map { pairs ->
            val (first, second) = pairs.split("-").map { it.toInt() }
            first..second
        }
    }

    fun part1(input: String): Int =
        calculateRanges(input).count { (firstRange, secondRange) ->
            (firstRange.first in secondRange && firstRange.last in secondRange) || (secondRange.first in firstRange && secondRange.last in firstRange)
        }

    fun part2(input: String): Int =
        calculateRanges(input).count { (firstRange, secondRange) ->
            firstRange.first in secondRange || firstRange.last in secondRange || secondRange.first in firstRange || secondRange.last in firstRange
        }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}

