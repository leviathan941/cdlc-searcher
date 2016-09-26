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

package cdlcsearcher.json.retrofit.json4s

import okhttp3.ResponseBody
import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods
import retrofit2.Converter

/** Json4s response converter.
  *
  * @author Alexey Kuzin <amkuzink@gmail.com>
  */
private[json4s] class Json4sResponseConverter[T] extends Converter[ResponseBody, T] {
  override def convert(value: ResponseBody): T = {
    implicit val formats = DefaultFormats

    JsonMethods.parse(value.string()).extract
  }
}
