/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.connectors.seatunnel.hudi.config;

import org.apache.seatunnel.api.configuration.Option;
import org.apache.seatunnel.api.configuration.Options;

import java.util.List;

public class HudiSinkConfig {

    public static final Option<List<String>> RECORD_KEY =
            Options.key("record.key")
                    .listType()
                    .noDefaultValue()
                    .withDescription("Record key of hudi sink.");

    public static final Option<String> TABLE_PATH =
            Options.key("table.path")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("The HDFS path of Hudi table path.");

    public static final Option<String> TABLE_NAME =
            Options.key("table.name")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("The table name of hudi table.");

    public static final Option<String> TABLE_TYPE =
            Options.key("table.type")
                    .stringType()
                    .defaultValue(ETableType.COW.getName())
                    .withDescription("The table type of hudi type.");

    public static final Option<String> INDEX_TYPE =
            Options.key("index.type")
                    .stringType()
                    .defaultValue("bucket_index")
                    .withDescription("The bucket index of hudi table.");
}
