// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListKeysResponseBuilderOps(val self: ListKeysResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala(value: Option[Seq[KeyListEntry]]): ListKeysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keys(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListKeysResponse.Builder = {
    value.fold(self) { v => self.nextMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def truncatedAsScala(value: Option[Boolean]): ListKeysResponse.Builder = {
    value.fold(self) { v => self.truncated(v) }
  }

}

final class ListKeysResponseOps(val self: ListKeysResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala: Option[Seq[KeyListEntry]] =
    Option(self.keys).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListKeysResponseOps {

  implicit def toListKeysResponseBuilderOps(v: ListKeysResponse.Builder): ListKeysResponseBuilderOps =
    new ListKeysResponseBuilderOps(v)

  implicit def toListKeysResponseOps(v: ListKeysResponse): ListKeysResponseOps = new ListKeysResponseOps(v)

}
