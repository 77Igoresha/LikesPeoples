import java.util.Scanner

fun main() {
    println("Введите количество лайков")
    val scanner = Scanner(System.`in`)
    val likes = scanner.nextInt()

    if ((likes - 11) % 100 == 0) {
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }

}