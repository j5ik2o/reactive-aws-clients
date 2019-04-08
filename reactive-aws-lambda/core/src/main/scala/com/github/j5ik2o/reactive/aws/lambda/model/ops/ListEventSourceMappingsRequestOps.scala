// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListEventSourceMappingsRequestBuilderOps(val self: ListEventSourceMappingsRequest.Builder) extends AnyVal {

  final def eventSourceArnAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  } // String

  final def functionNameAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def markerAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListEventSourceMappingsRequestOps(val self: ListEventSourceMappingsRequest) extends AnyVal {

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn) // String

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

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
