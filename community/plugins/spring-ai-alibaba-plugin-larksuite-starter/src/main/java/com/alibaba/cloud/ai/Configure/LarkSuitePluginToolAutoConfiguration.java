/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.Configure;

import com.alibaba.cloud.ai.properties.LarkSuiteProperties;
import com.alibaba.cloud.ai.service.LarkSuiteService;
import org.springframework.context.annotation.Description;


/**
 * @author 北极星
 */
@EnableConfigurationProperties({LarkSuiteProperties.class})
public class PluginToolAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @Description("it calls the document api to invoke a method to create a larksuite document")
    @ConditionalOnProperty(prefix = "spring.ai.alibaba.plugin.larksuite", name = "enabled", havingValue = "true")
    public LarkSuiteService larkSuiteBuild() {
        return new LarkSuiteService();
    }
}
