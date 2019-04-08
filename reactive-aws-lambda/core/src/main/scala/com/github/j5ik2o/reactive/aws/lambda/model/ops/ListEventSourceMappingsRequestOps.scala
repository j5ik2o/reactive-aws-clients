// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListEventSourceMappingsRequestBuilderOps(val self: ListEventSourceMappingsRequest.Builder) extends AnyVal {

  final def eventSourceArnAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.eventSourceArn(v)
    }
  }

  final def functionNameAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def maxItemsAsScala(value: Option[Int]): ListEventSourceMappingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListEventSourceMappingsRequestOps(val self: ListEventSourceMappingsRequest) extends AnyVal {

  final def eventSourceArnAsScala: Option[String] = Option(self.eventSourceArn)

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def markerAsScala: Option[String] = Option(self.marker)

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
