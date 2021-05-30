package com.fun_topics_api.presentation.controller

import com.fun_topics_api.application.service.CommonTopicService
import com.fun_topics_api.domain.model.CommonTopic
import com.fun_topics_api.presentation.dto.request.CreateCommonTopicReq
import com.fun_topics_api.presentation.dto.response.CommonTopicRes
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/common_topic")
class CommonTopicController(
    private val commonTopicService: CommonTopicService
) {

    @GetMapping("/list")
    fun getCommonTopics(): List<CommonTopicRes> {
        return commonTopicService.getCommonTopics().map {
            CommonTopicRes(
                it.id,
                it.content
            )
        }
    }

    @PostMapping("/create")
    fun create(@RequestBody request: CreateCommonTopicReq) {
        commonTopicService.createCommonTopic(
            CommonTopic(
                request.id,
                request.content
            )
        )
    }
}
