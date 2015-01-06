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

package com.reveldigital.api.service;

import com.reveldigital.api.RequestException;
import com.reveldigital.api.Template;
import com.reveldigital.api.service.retrofit.TemplateInterface;
import retrofit.Callback;

import java.util.List;

/**
 * Created by Mike on 5/15/2015.
 */
public class TemplateService extends BaseService<TemplateInterface> {

    public List<Template> getTemplates() throws RequestException {
        return wrapper.getTemplates();
    }

    public void getTemplates(Callback<List<Template>> callback) throws RequestException {
        wrapper.getTemplates(callback);
    }

    public Template getTemplate(String id) throws RequestException {
        return wrapper.getTemplate(id);
    }

    public void getTemplate(String id, Callback<Template> callback) throws RequestException {
        wrapper.getTemplate(id, callback);
    }

    public static class Builder extends BaseService.Builder {

        public TemplateService build() {
            TemplateService service = new TemplateService();
            service.wrapper = build(TemplateInterface.class);
            return service;
        }
    }
}
