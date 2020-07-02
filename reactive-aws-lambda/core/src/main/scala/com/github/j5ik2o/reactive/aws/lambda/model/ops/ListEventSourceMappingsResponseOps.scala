// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListEventSourceMappingsResponseBuilderOps(val self: ListEventSourceMappingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListEventSourceMappingsResponse.Builder = {
    value.fold(self) { v => self.nextMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceMappingsAsScala(
      value: Option[Seq[EventSourceMappingConfiguration]]
  ): ListEventSourceMappingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.eventSourceMappings(v.asJava)
    }
  }

}

final class ListEventSourceMappingsResponseOps(val self: ListEventSourceMappingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventSourceMappingsAsScala: Option[Seq[EventSourceMappingConfiguration]] =
    Option(self.eventSourceMappings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
