@file:JsExport

package formatter

import kotlin.js.JsExport

interface Formatter<in T> {
    fun format(o: T): String
}