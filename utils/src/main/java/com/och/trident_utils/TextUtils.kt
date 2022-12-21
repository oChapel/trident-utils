package com.och.trident_utils

object TextUtils {
    fun String.isNotEmptyOrNull(): Boolean = this.isNotEmpty() && this != "null"
}