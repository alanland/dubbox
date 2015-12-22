package com.github.alanland.demo.provider

import com.github.alanland.demo.api.User
import com.github.alanland.demo.api.UserService

/**
 *
 * @author 王成义
 * @date 2015-12-22
 */
class UserServiceImpl implements UserService {

    User getUser(Long id) {
        return new User(id, "username" + id);
    }
}
