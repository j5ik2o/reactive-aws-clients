// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListRetirableGrantsResponseBuilderOps(val self: ListRetirableGrantsResponse.Builder) extends AnyVal {

  final def grantsAsScala(value: Option[Seq[GrantListEntry]]): ListRetirableGrantsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grants(v.asJava)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): ListRetirableGrantsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def truncatedAsScala(value: Option[Boolean]): ListRetirableGrantsResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class ListRetirableGrantsResponseOps(val self: ListRetirableGrantsResponse) extends AnyVal {

  final def grantsAsScala: Option[Seq[GrantListEntry]] = Option(self.grants).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListRetirableGrantsResponseOps {

  implicit def toListRetirableGrantsResponseBuilderOps(
      v: ListRetirableGrantsResponse.Builder
  ): ListRetirableGrantsResponseBuilderOps = new ListRetirableGrantsResponseBuilderOps(v)

  implicit def toListRetirableGrantsResponseOps(v: ListRetirableGrantsResponse): ListRetirableGrantsResponseOps =
    new ListRetirableGrantsResponseOps(v)

}
