// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListStreamProcessorsRequestBuilderOps(val self: ListStreamProcessorsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStreamProcessorsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListStreamProcessorsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListStreamProcessorsRequestOps(val self: ListStreamProcessorsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamProcessorsRequestOps {

  implicit def toListStreamProcessorsRequestBuilderOps(
      v: ListStreamProcessorsRequest.Builder
  ): ListStreamProcessorsRequestBuilderOps = new ListStreamProcessorsRequestBuilderOps(v)

  implicit def toListStreamProcessorsRequestOps(v: ListStreamProcessorsRequest): ListStreamProcessorsRequestOps =
    new ListStreamProcessorsRequestOps(v)

}
