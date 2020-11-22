package com.ygaller

enum class Questions {
  Revenue;

  companion object {
    fun fromId(id: String) = when (id) {
      REVENUE -> Revenue
      else -> throw Exception("Unknown")
    }
  }
}
