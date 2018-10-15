package cl.nygma.keyproject.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/message")
class IndexController {

    companion object {
        val logger = LoggerFactory.getLogger(IndexController::class.java)
    }

    @GetMapping
    fun getSome() {
        logger.info("/get")
    }

    @PostMapping
    fun create() {
        logger.info("/post")
    }

    @PutMapping
    fun update() {
        logger.info("/put")
    }

    @DeleteMapping
    fun delete() {
        logger.info("/delete")
    }

}