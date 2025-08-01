package com.beforeyoubet.props

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "cors")
data class CorsProps(var allowed: List<String>)