package com.xumo.redisdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash
public record Person(@Id String name, List<Address> addressList) {
}
