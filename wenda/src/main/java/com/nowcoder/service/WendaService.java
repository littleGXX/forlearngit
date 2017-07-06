package com.nowcoder.service;

import org.springframework.stereotype.Service;

/**
 * IoC：依赖注入
 *
 * Created by nowcoder on 2016/7/10.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {

        return "Hello Message:" + String.valueOf(userId);
    }
}
