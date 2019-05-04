// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListCollectionsRequestBuilderOps(val self: ListCollectionsRequest.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): ListCollectionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListCollectionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListCollectionsRequestOps(val self: ListCollectionsRequest) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListCollectionsRequestOps {

  implicit def toListCollectionsRequestBuilderOps(v: ListCollectionsRequest.Builder): ListCollectionsRequestBuilderOps =
    new ListCollectionsRequestBuilderOps(v)

  implicit def toListCollectionsRequestOps(v: ListCollectionsRequest): ListCollectionsRequestOps =
    new ListCollectionsRequestOps(v)

}
