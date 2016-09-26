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

import okhttp3.{MediaType, RequestBody}
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization
import retrofit2.Converter

/** Json4s request converter.
  *
  * @author Alexey Kuzin <amkuzink@gmail.com>
  */
private[json4s] class Json4sRequestConverter[T <: AnyRef] extends Converter[T, RequestBody] {
  override def convert(obj: T): RequestBody = {
    implicit val formats = DefaultFormats

    RequestBody.create(Json4sRequestConverter.MEDIA_TYPE, Serialization.write(obj))
  }
}

private object Json4sRequestConverter {
  val MEDIA_TYPE: MediaType = MediaType.parse("application/json; charset=UTF-8")
}
