// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketLifecycleConfigurationResponse => ScalaGetBucketLifecycleConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketLifecycleConfigurationResponse => JavaGetBucketLifecycleConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLifecycleConfigurationResponseOps {

  implicit class JavaGetBucketLifecycleConfigurationResponseOps(val self: JavaGetBucketLifecycleConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetBucketLifecycleConfigurationResponse = {
      ScalaGetBucketLifecycleConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRules(Option(self.rules).map { v =>
          import scala.collection.JavaConverters._, LifecycleRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[LifecycleRule]
    }

  }

}
