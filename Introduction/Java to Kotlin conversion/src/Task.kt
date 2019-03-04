fun toJSON(collection: Collection<Int>): String = json {
    append("[")
    val item = collection.iterator()
    while (item.hasNext()) {
        val element = item.next()
        append(element)
        if (item.hasNext()) {
            append(", ")
        }
    }
    append("]")
}.toString()

fun json(sb: StringBuilder.() -> Unit): StringBuilder = StringBuilder().apply(sb)
