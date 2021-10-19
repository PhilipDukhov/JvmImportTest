package com.example.jvmimporttest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}