fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((i, product) in products.withIndex()) {
                tr {
                    td(getCellColor(i, 1)) { text(product.description) }
                    td(getCellColor(i, 2)) { text(product.price) }
                    td(getCellColor(i, 3)) { text(product.popularity) }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
