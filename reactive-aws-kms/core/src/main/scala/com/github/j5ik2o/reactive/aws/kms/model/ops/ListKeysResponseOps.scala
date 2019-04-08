// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListKeysResponseBuilderOps(val self: ListKeysResponse.Builder) extends AnyVal {

  final def keysAsScala(value: Option[Seq[KeyListEntry]]): ListKeysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keys(v.asJava)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): ListKeysResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def truncatedAsScala(value: Option[Boolean]): ListKeysResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class ListKeysResponseOps(val self: ListKeysResponse) extends AnyVal {

  final def keysAsScala: Option[Seq[KeyListEntry]] = Option(self.keys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListKeysResponseOps {

  implicit def toListKeysResponseBuilderOps(v: ListKeysResponse.Builder): ListKeysResponseBuilderOps =
    new ListKeysResponseBuilderOps(v)

  implicit def toListKeysResponseOps(v: ListKeysResponse): ListKeysResponseOps = new ListKeysResponseOps(v)

}
