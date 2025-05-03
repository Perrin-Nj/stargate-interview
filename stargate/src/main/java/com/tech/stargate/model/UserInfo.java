package com.tech.stargate.model;

import lombok.Builder;

@Builder
public record UserInfo(
        String name,
        String profession,
        String status,
        String imageUrl
) {}
