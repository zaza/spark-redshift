/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package io.github.spark_redshift_community.spark.redshift.pushdown

import org.apache.spark.sql.Row


// class representing each test case we'd like to run
case class TestCase(
                     sparkStatement: String, // the spark statement executed
                     expectedResult: Seq[Row], // the expected result
                     // Redshift query pushdown, used as default value when 3.3 answer is the same
                     expectedAnswerSpark3_2: String = "",
                     expectedAnswerSpark3_3: String = ""
                   )