import react.Props
import react.fc
import styled.styledDiv
import kotlin.js.Date
import kotlin.math.ceil
import kotlin.math.floor

fun getWeekNumber(): Int {
    val currentDate = Date()
    val oneJan = Date(currentDate.getFullYear(), 0, 1)
    val numberOfDays = floor((currentDate.getTime() - oneJan.getTime()) / (24 * 60 * 60 * 1000))
    console.log((currentDate.getTime() - oneJan.getTime()))
    return ceil((currentDate.getDay() + 1 + numberOfDays) / 7).toInt();
}

val Layout = fc<Props> {

    styledDiv {

        +"Week ${getWeekNumber()}"
    }
}