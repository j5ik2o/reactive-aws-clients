// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutPublicAccessBlockResponse => ScalaPutPublicAccessBlockResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutPublicAccessBlockResponse => JavaPutPublicAccessBlockResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutPublicAccessBlockResponseOps {

  implicit class JavaPutPublicAccessBlockResponseOps(val self: JavaPutPublicAccessBlockResponse) extends AnyVal {

    def toScala: ScalaPutPublicAccessBlockResponse = {
      ScalaPutPublicAccessBlockResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
