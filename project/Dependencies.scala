/*
 * Copyright 2016 Alexey Kuzin <amkuzink@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sbt._
import Keys._

object Dependencies {
  lazy val scala211 = "2.11.8"

  lazy val scalaDi = "org.scaldi" %% "scaldi" % "latest.integration";

  lazy val json4sNative = "org.json4s" %% "json4s-native" % "latest.integration"
  lazy val json4sJackson = "org.json4s" %% "json4s-jackson" % "latest.integration"

  lazy val retrofit = "com.squareup.retrofit2" % "retrofit" % "latest.integration"
}
