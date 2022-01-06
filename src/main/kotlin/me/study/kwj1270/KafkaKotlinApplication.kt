package me.study.kwj1270

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaKotlinApplication

fun main(args: Array<String>) {
    runApplication<KafkaKotlinApplication>(*args)
}
