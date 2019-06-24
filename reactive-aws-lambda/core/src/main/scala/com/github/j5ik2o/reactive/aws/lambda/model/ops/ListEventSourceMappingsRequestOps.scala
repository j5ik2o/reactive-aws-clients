// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListEventSourceMappingsRequestBuilderOps(val self: ListEventSourceMappingsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListEventSourceMappingsRequestOps(val self: ListEventSourceMappingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListEventSourceMappingsRequestOps {

  implicit def toListEventSourceMappingsRequestBuilderOps(
      v: ListEventSourceMappingsRequest.Builder
  ): ListEventSourceMappingsRequestBuilderOps = new ListEventSourceMappingsRequestBuilderOps(v)

  implicit def toListEventSourceMappingsRequestOps(
      v: ListEventSourceMappingsRequest
  ): ListEventSourceMappingsRequestOps = new ListEventSourceMappingsRequestOps(v)

}
