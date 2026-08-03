package com.example.linkdigest.domain.repository

import com.example.linkdigest.data.database.AppLogEntity
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getLogs(): Flow<List<AppLogEntity>>
    suspend fun addLog(title: String, content: String)
}
