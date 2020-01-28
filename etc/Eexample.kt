// O(1)
fun isFirstElementNull(list: List<String?>) = list[0] == null

// O(n)
fun containsValue(list: List<String>, value: String): Boolean {
    list.forEach { it ->
        if (it == value) return true
    }
    return false
} 

/** O(n^2) 
* Bubble sort
*/
fun bubble_sort(list: MutableList<String>) {
    val size = list.size

    for (x in 0 until size) {
        for (y in x + 1 until size) {
            println("\tx=$x, y=$y")
            if (list[y] < list[x]) {
                list.swap(y, x)
            }
        }
    }
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

//O(2^n)
fun fib(number: Int): Int =
    if (number <= 1) number
    else fib(number - 1) + fib(number - 2)

// O(log n)
fun binarySearch(item: String, list: List<String>): Boolean {
    // Exit conditions (base cases)
    if (list.isEmpty()) {
        return false
    }

    // Setup probe
    val probeIndex = list.size / 2
    val probeItem = list[probeIndex]

    // Does the probe match? If not, split and recurse
    when {
        item == probeItem -> return true
        item < probeItem -> return binarySearch(item, 
                                                list.subList(0, probeIndex))
        else -> return binarySearch(item, 
                                    list.subList(probeIndex + 1, size))
    }
}

// O(n * log n)
fun merge(leftList: MutableList<String>, rightList: MutableList<String>): 
        MutableList<String> {
    val result = mutableListOf<String>()
    var leftIndex = 0
    var rightIndex = 0

    while (leftIndex < leftList.size && rightIndex < rightList.size) {
        val lhs = leftList[leftIndex]
        val rhs = rightList[rightIndex]
        if (lhs < rhs) {
            result.add(lhs)
            leftIndex++
        } else {
            result.add(rhs)
            rightIndex++
        }
    }

    // Copy remaining elements of leftList (if any) into the result
    while (leftIndex < leftList.size) {
        result.add(leftList[leftIndex])
        leftIndex++
    }

    // Copy remaining elements of rightList (if any) into the result
    while (rightIndex < rightList.size) {
        result.add(rightList[rightIndex])
        rightIndex++
    }

    return result
}
