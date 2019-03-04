import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{
    override fun compareTo(other: MyDate): Int{
        if(year != other.year) return year - other.year
        if(month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
    open fun getDate(): Date = getDate(this)

    open fun getDate(myDate: MyDate): Date =
            getDate(year = myDate.year, month = myDate.month, day = myDate.dayOfMonth)

    open fun getDate(year: Int, month: Int, day: Int): Date = Date(year, month, day)
}