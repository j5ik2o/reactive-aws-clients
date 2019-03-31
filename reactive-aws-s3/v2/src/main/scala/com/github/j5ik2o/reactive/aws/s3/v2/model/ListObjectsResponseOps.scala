// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectsResponse => ScalaListObjectsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectsResponse => JavaListObjectsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectsResponseOps {

  implicit class JavaListObjectsResponseOps(val self: JavaListObjectsResponse) extends AnyVal {

    def toScala: ScalaListObjectsResponse = {
      ScalaListObjectsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withMarker(Option(self.marker)) // String
        .withNextMarker(Option(self.nextMarker)) // String
        .withContents(Option(self.contents).map { v =>
          import scala.collection.JavaConverters._, S3ObjectOps._; v.asScala.map(_.toScala)
        }) // Seq[S3Object]
        .withName(Option(self.name)) // String
        .withPrefix(Option(self.prefix)) // String
        .withDelimiter(Option(self.delimiter)) // String
        .withMaxKeys(Option(self.maxKeys).map(_.intValue)) // Int
        .withCommonPrefixes(Option(self.commonPrefixes).map { v =>
          import scala.collection.JavaConverters._, CommonPrefixOps._; v.asScala.map(_.toScala)
        }) // Seq[CommonPrefix]
        .withEncodingType(Option(self.encodingType).map { v =>
          import EncodingTypeOps._; v.toScala
        }) // String
    }

  }

}
