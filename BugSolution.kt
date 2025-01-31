fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val mapIterator = map.iterator()
    while (mapIterator.hasNext()) {
        val entry = mapIterator.next()
        if (entry.value > 2) {
            mapIterator.remove()
        }
    }
    println(map) // Output: {a=1, b=2}
} 