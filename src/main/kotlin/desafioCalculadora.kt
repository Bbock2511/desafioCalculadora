import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toDouble()

    print("Digite a operação desejada (+, -, *, /, ^, s): ")
    val op = readln()[0]
    print("Digite o segundo número: ")
    val num2 = readln().toDouble()

    val resultado = when (op) {
        '+' -> soma(num1, num2)
        '-' -> subtracao(num1, num2)
        '*' -> multiplicacao(num1, num2)
        '/' -> divisao(num1, num2)
        '^' -> potencia(num1, num2)
        's' -> raizQuadrada(num1)
        else -> throw IllegalArgumentException("Operação inválida: $op")
    }

    println("Resultado: $resultado")
}

fun soma(a: Double, b: Double): Double {
    return a + b
}

fun subtracao(a: Double, b: Double): Double {
    return a - b
}

fun multiplicacao(a: Double, b: Double): Double {
    return a * b
}

fun divisao(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Não é possível dividir por zero")
    }
    return a / b
}

fun potencia(a: Double, b: Double): Double {
    return a.pow(b)
}

fun raizQuadrada(a: Double): Double {
    if (a < 0) {
        throw IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo")
    }
    return sqrt(a)
}
