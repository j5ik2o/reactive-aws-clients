// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListEventSourceMappingsResponseBuilderOps(val self: ListEventSourceMappingsResponse.Builder)
    extends AnyVal {

  final def nextMarkerAsScala(value: Option[String]): ListEventSourceMappingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  } // String

  final def eventSourceMappingsAsScala(
      value: Option[Seq[EventSourceMappingConfiguration]]
  ): ListEventSourceMappingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.eventSourceMappings(v.asJava)
    } // Seq[EventSourceMappingConfiguration]
  }

}

final class ListEventSourceMappingsResponseOps(val self: ListEventSourceMappingsResponse) extends AnyVal {

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker) // String

  final def eventSourceMappingsAsScala: Option[Seq[EventSourceMappingConfiguration]] =
    Option(self.eventSourceMappings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[EventSourceMappingConfiguration]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListEventSourceMappingsResponseOps {

  implicit def toListEventSourceMappingsResponseBuilderOps(
      v: ListEventSourceMappingsResponse.Builder
  ): ListEventSourceMappingsResponseBuilderOps = new ListEventSourceMappingsResponseBuilderOps(v)

  implicit def toListEventSourceMappingsResponseOps(
      v: ListEventSourceMappingsResponse
  ): ListEventSourceMappingsResponseOps = new ListEventSourceMappingsResponseOps(v)

}
