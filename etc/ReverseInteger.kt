class ReverseInteger {

fun reverse(x: Int): Int {
        var xx = x
        var y: String = ""
        var isMinus: Boolean = false
        if(xx<0) {
            isMinus = true
            xx *= -1
            y = "-"
        }

        while(xx >= 10) {
            var remainder = xx%10
            y += ("" + remainder)
            xx = xx/10
        }
        y += ("" + xx)

        try {
            var yy = y.toInt()
            return yy
        } catch(e: Exception) {
            return 0
        }
    }
}
