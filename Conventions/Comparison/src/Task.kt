import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return getDate(this).compareTo(getDate(other))
    }

    fun getDate(myDate: MyDate): Date =
            getDate(year = myDate.year, month = myDate.month, day = myDate.dayOfMonth)

    fun getDate(year: Int, month: Int, day: Int): Date = Date(year, month, day)
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
