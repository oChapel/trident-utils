package com.och.trident_utils

object TextUtils {
    fun emptyString(): String = ""
    fun String.isNotEmptyOrNull(): Boolean = this.isNotEmpty() && this != "null"
    fun String.newUserAgentString(): String = this.replace("wv", "")
}