// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListGrantsResponseBuilderOps(val self: ListGrantsResponse.Builder) extends AnyVal {

  final def grantsAsScala(value: Option[Seq[GrantListEntry]]): ListGrantsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grants(v.asJava)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): ListGrantsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def truncatedAsScala(value: Option[Boolean]): ListGrantsResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class ListGrantsResponseOps(val self: ListGrantsResponse) extends AnyVal {

  final def grantsAsScala: Option[Seq[GrantListEntry]] = Option(self.grants).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGrantsResponseOps {

  implicit def toListGrantsResponseBuilderOps(v: ListGrantsResponse.Builder): ListGrantsResponseBuilderOps =
    new ListGrantsResponseBuilderOps(v)

  implicit def toListGrantsResponseOps(v: ListGrantsResponse): ListGrantsResponseOps = new ListGrantsResponseOps(v)

}
