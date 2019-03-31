// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectVersionsResponse => ScalaListObjectVersionsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectVersionsResponse => JavaListObjectVersionsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectVersionsResponseOps {

  implicit class JavaListObjectVersionsResponseOps(val self: JavaListObjectVersionsResponse) extends AnyVal {

    def toScala: ScalaListObjectVersionsResponse = {
      ScalaListObjectVersionsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withKeyMarker(Option(self.keyMarker)) // String
        .withVersionIdMarker(Option(self.versionIdMarker)) // String
        .withNextKeyMarker(Option(self.nextKeyMarker)) // String
        .withNextVersionIdMarker(Option(self.nextVersionIdMarker)) // String
        .withVersions(Option(self.versions).map { v =>
          import scala.collection.JavaConverters._, ObjectVersionOps._; v.asScala.map(_.toScala)
        }) // Seq[ObjectVersion]
        .withDeleteMarkers(Option(self.deleteMarkers).map { v =>
          import scala.collection.JavaConverters._, DeleteMarkerEntryOps._; v.asScala.map(_.toScala)
        }) // Seq[DeleteMarkerEntry]
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
