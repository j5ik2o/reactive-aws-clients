// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketEncryptionResponse => ScalaGetBucketEncryptionResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketEncryptionResponse => JavaGetBucketEncryptionResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketEncryptionResponseOps {

  implicit class JavaGetBucketEncryptionResponseOps(val self: JavaGetBucketEncryptionResponse) extends AnyVal {

    def toScala: ScalaGetBucketEncryptionResponse = {
      ScalaGetBucketEncryptionResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withServerSideEncryptionConfiguration(Option(self.serverSideEncryptionConfiguration).map { v =>
          import ServerSideEncryptionConfigurationOps._; v.toScala
        }) // ServerSideEncryptionConfiguration
    }

  }

}
