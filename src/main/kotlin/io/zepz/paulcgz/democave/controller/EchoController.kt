package io.zepz.paulcgz.democave.controller

import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/echo")
class EchoController {

    @PostMapping
    fun echo(@RequestHeader headers: HttpHeaders, @RequestBody body: String?): Map<String, Any> {
        val response = mutableMapOf<String, Any>()
        response["headers"] = headers.toMutableMap()
        response["body"] = body ?: ""
        return response
    }
}
