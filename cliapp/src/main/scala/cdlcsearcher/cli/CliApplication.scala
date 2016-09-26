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

package cdlcsearcher.cli

import cdlcsearcher.json.JsonModule
import cdlcsearcher.json.JsonModule.RetrofitConverterFactory
import scaldi.Injectable._

/** Command line frontend for the searcher.
  *
  * @author Alexey Kuzin <amkuzink@gmail.com>
  */
object CliApplication {
  def main(args: Array[String]): Unit = {
    implicit val injector = new JsonModule

    val jsonConverterFactory = inject [RetrofitConverterFactory]
  }
}
