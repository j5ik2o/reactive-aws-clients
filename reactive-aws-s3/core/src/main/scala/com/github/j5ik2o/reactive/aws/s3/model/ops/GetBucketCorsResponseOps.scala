// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketCorsResponse => ScalaGetBucketCorsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketCorsResponse => JavaGetBucketCorsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketCorsResponseOps {

  implicit class JavaGetBucketCorsResponseOps(val self: JavaGetBucketCorsResponse) extends AnyVal {

    def toScala: ScalaGetBucketCorsResponse = {
      ScalaGetBucketCorsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withCorsRules(Option(self.corsRules).map { v =>
          import scala.collection.JavaConverters._, CORSRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[CORSRule]
    }

  }

}
