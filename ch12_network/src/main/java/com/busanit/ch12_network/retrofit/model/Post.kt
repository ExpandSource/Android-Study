package com.busanit.ch12_network.retrofit.model

// 데이터 클래스 정의
data class Post(
    val userId: Int,
    val id: Int,        // 식별자
    val title: String,
    val body: String
)