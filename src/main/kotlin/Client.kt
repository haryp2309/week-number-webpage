import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import react.dom.render
import styled.injectGlobal

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(Layout)
        }
    }

    val styles = CssBuilder(allowClasses = false).apply {
        root {
            fontFamily = "Tahoma"
            color = Color.white
            fontSize = 3.rem
        }
        body {
            backgroundColor = Color("#ff7c00")
            margin(0.px)
            padding(0.px)
            display = Display.flex
            justifyContent = JustifyContent.center
            alignItems = Align.center
            minHeight = 100.vh
        }
    }

    injectGlobal(styles.toString())
}




