// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayerVersionsResponseBuilderOps(val self: ListLayerVersionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListLayerVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionsAsScala(value: Option[Seq[LayerVersionsListItem]]): ListLayerVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layerVersions(v.asJava)
    }
  }

}

final class ListLayerVersionsResponseOps(val self: ListLayerVersionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerVersionsAsScala: Option[Seq[LayerVersionsListItem]] = Option(self.layerVersions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayerVersionsResponseOps {

  implicit def toListLayerVersionsResponseBuilderOps(
      v: ListLayerVersionsResponse.Builder
  ): ListLayerVersionsResponseBuilderOps = new ListLayerVersionsResponseBuilderOps(v)

  implicit def toListLayerVersionsResponseOps(v: ListLayerVersionsResponse): ListLayerVersionsResponseOps =
    new ListLayerVersionsResponseOps(v)

}
