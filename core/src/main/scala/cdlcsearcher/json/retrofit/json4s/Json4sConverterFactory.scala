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

import java.lang.annotation.Annotation
import java.lang.reflect.Type
import okhttp3.{RequestBody, ResponseBody}
import retrofit2.{Converter, Retrofit}

/** Retrofit converter factory implementation.
  *
  * @author Alexey Kuzin <amkuzink@gmail.com>
  */
private[json] class Json4sConverterFactory extends Converter.Factory {
  override def requestBodyConverter(javaType: Type,
                                    parameterAnnotations: Array[Annotation],
                                    methodAnnotations: Array[Annotation],
                                    retrofit: Retrofit): Converter[_, RequestBody] = {
    new Json4sRequestConverter
  }

  override def responseBodyConverter(javaType: Type,
                                     annotations: Array[Annotation],
                                     retrofit: Retrofit): Converter[ResponseBody, _] = {
    new Json4sResponseConverter
  }
}
