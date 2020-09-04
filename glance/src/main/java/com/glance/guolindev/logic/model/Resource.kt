/*
 * Copyright (C)  guolin, Glance Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glance.guolindev.logic.model

/**
 * A generic class that holds a value with its success, error or loading status.
 *
 * @author guolin
 * @since 2020/9/4
 */
data class Resource<T>(val status: Int, val data: T?, val message: String?) {

    companion object {

        private const val SUCCESS = 0
        private const val ERROR = 1
        private const val LOADING = 2

        fun <T> success(data: T?) = Resource(SUCCESS, data, null)

        fun <T> error(msg: String) = Resource<T>(ERROR, null, msg)

        fun <T> loading() = Resource<T>(LOADING, null, null)
    }

}