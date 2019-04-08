// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListResourceTagsResponseBuilderOps(val self: ListResourceTagsResponse.Builder) extends AnyVal {

  final def tagsAsScala(value: Option[Seq[Tag]]): ListResourceTagsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): ListResourceTagsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def truncatedAsScala(value: Option[Boolean]): ListResourceTagsResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class ListResourceTagsResponseOps(val self: ListResourceTagsResponse) extends AnyVal {

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResourceTagsResponseOps {

  implicit def toListResourceTagsResponseBuilderOps(
      v: ListResourceTagsResponse.Builder
  ): ListResourceTagsResponseBuilderOps = new ListResourceTagsResponseBuilderOps(v)

  implicit def toListResourceTagsResponseOps(v: ListResourceTagsResponse): ListResourceTagsResponseOps =
    new ListResourceTagsResponseOps(v)

}
