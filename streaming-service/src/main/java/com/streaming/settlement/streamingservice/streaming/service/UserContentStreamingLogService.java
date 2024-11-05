package com.streaming.settlement.streamingservice.streaming.service;

import com.streaming.settlement.streamingservice.streaming.domain.UserContentStreamingLog;

public interface UserContentStreamingLogService {
    void create(UserContentStreamingLog userContentStreamingLog);
    Long getLastPlaybackPositionOfLatestStreaming(Long userId, Long contentId);
}