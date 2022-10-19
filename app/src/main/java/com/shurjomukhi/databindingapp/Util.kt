package com.shurjomukhi.databindingapp

import java.math.BigInteger
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.ParsePosition

object Util {
    public const val BASE_URL_LENDING = "http://192.168.10.130:8080/mos/"
    public const val TAKA_SYMBLE = "৳"


    fun getIntegerFromDouble(doubleAmount: Double?): Int {
        var result = 0
        if (doubleAmount != null) {
            val value = doubleAmount.toString()
            if (value.contains(".")) {
                val array = value.split("\\.").toTypedArray()
                result = array[0].toInt()
                return result
            }
            if (isNumeric(value)) return value.toInt()
        } else {
            return 0
        }
        return result
    }


    fun getMoneyFormat(value: String): String {
        val df = DecimalFormat("##,##,##,###.##")
        return TAKA_SYMBLE + " " + df.format(getNumeric(value)?.let { BigInteger(it) })
    }

    fun isNumeric(str: String): Boolean {
        val pos = ParsePosition(0)
        NumberFormat.getInstance().parse(str, pos)
        return str.length == pos.index
    }

    fun getNumeric(value: String): String {
        var result = value.trim { it <= ' ' }
        if (result.contains(" ")) {
            result = result.replace(" ", "")
        }
        if (result.contains(TAKA_SYMBLE)) {
            result = result.replace(TAKA_SYMBLE, "")
        }
        if (result.contains(",")) {
            result = result.replace(",", "")
        }
        if (result.contains(".")) {
            result = result.replace(".", "")
        }
        return if (isContainingNumber(result)) {
            result
        } else {
            "0"
        }
    }

    fun isContainingNumber(value: String): Boolean {
        val chars = value.toCharArray()
        for (c in chars) {
            if (Character.isDigit(c)) {
                return true
            }
        }
        return false
    }


}