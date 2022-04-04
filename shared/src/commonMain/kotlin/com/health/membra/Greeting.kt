package com.health.membra

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}