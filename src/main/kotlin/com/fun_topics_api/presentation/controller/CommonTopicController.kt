package com.fun_topics_api.presentation.controller

import com.fun_topics_api.application.service.CommonTopicService
import com.fun_topics_api.presentation.dto.response.CommonTopicRes
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class CommonTopicController(
    private val commonTopicService: CommonTopicService
) {

    @GetMapping("/common_topics")
    fun getCommonTopics(): List<CommonTopicRes> {
        return commonTopicService.getCommonTopics().map {
            CommonTopicRes(
                it.id,
                it.content
            )
        }
    }
}
