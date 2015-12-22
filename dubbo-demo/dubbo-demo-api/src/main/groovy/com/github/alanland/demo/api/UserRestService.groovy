package com.github.alanland.demo.api

import javax.validation.constraints.Min;

/**
 *
 * @author 王成义
 * @date 2015-12-22
 */
interface UserRestService {
    User getUser(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
}