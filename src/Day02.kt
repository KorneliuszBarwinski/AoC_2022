fun main() {
    fun calculatePointsFirstStrategy(values: List<String>) : Int {
        val me = values[1]
        val opponent = values[0]
        var pointsForRound = 0

        when (me) {
            "X" -> {
                pointsForRound += 1
                if (opponent == "A") pointsForRound += 3
                if (opponent == "C") pointsForRound += 6
            }
            "Y" -> {
                pointsForRound += 2
                if (opponent == "B") pointsForRound += 3
                if (opponent == "A") pointsForRound += 6
            }
            "Z" -> {
                pointsForRound += 3
                if (opponent == "C") pointsForRound += 3
                if (opponent == "B") pointsForRound += 6
            }
        }
        return pointsForRound

    }

    fun calculatePointsSecondStrategy(values: List<String>) : Int {
        val opponent = values[0]
        val result = values[1]
        var pointsForRound = 0

        when (opponent){
            "A" -> {
                when (result){
                    "X" -> {
                        pointsForRound += 0
                        pointsForRound += 3
                    }
                    "Y" -> {
                        pointsForRound += 3
                        pointsForRound += 1
                    }
                    "Z" -> {
                        pointsForRound += 6
                        pointsForRound += 2
                    }
                }
            }
            "B" -> {
                when (result){
                    "X" -> {
                        pointsForRound += 0
                        pointsForRound += 1
                    }
                    "Y" -> {
                        pointsForRound += 3
                        pointsForRound += 2
                    }
                    "Z" -> {
                        pointsForRound += 6
                        pointsForRound += 3
                    }
                }

            }
            "C" -> {
                when (result){
                    "X" -> {
                        pointsForRound += 0
                        pointsForRound += 2
                    }
                    "Y" -> {
                        pointsForRound += 3
                        pointsForRound += 3
                    }
                    "Z" -> {
                        pointsForRound += 6
                        pointsForRound += 1
                    }
                }

            }
        }
        return pointsForRound

    }

    fun calculateTotalPointsFirstStrategy(input: String) = input.split("\r\n").sumOf { round -> calculatePointsFirstStrategy(round.split(" ")) }

    fun calculateTotalPointsSecondStrategy(input: String) = input.split("\r\n").sumOf { round -> calculatePointsSecondStrategy(round.split(" ")) }

    fun part1(input: String): Int {
        return calculateTotalPointsFirstStrategy(input)
    }

    fun part2(input: String): Int {
        return calculateTotalPointsSecondStrategy(input)
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

