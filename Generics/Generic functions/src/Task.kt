import java.util.*

fun <S, L : MutableCollection<S>> Iterable<S>.partitionTo(first: L, second: L, function: (S) -> Boolean): Pair<Iterable<S>, Iterable<S>> {
    forEach { if (function(it)) first.add(it) else second.add(it) }
    return Pair(first, second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
            .partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
            .partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
