/*
 * Copyright (c) 2015. Catalyst LLC. All right reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reveldigital.api;

/**
 * Created by Mike on 5/19/2014.
 */
public class RequestException extends Exception {

    public final String statusMessage;
    public final int statusCode;

    public RequestException(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public RequestException(String statusMessage) {
        this.statusCode = 0;
        this.statusMessage = statusMessage;
    }

    public RequestException(int statusCode, RequestError error) {
        this.statusCode = statusCode;
        this.statusMessage = error.getDescription();
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }
}