package com.xumo.redisdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;
import java.util.Map;

@RedisHash
public record People(@Id String key, Map<Address, List<Person>> residents) {
}
