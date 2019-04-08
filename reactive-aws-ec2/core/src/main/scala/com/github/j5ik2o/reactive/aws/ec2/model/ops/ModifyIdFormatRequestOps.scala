// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyIdFormatRequestBuilderOps(val self: ModifyIdFormatRequest.Builder) extends AnyVal {

  final def resourceAsScala(value: Option[String]): ModifyIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

  final def useLongIdsAsScala(value: Option[Boolean]): ModifyIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.useLongIds(v)
    }
  }

}

final class ModifyIdFormatRequestOps(val self: ModifyIdFormatRequest) extends AnyVal {

  final def resourceAsScala: Option[String] = Option(self.resource)

  final def useLongIdsAsScala: Option[Boolean] = Option(self.useLongIds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyIdFormatRequestOps {

  implicit def toModifyIdFormatRequestBuilderOps(v: ModifyIdFormatRequest.Builder): ModifyIdFormatRequestBuilderOps =
    new ModifyIdFormatRequestBuilderOps(v)

  implicit def toModifyIdFormatRequestOps(v: ModifyIdFormatRequest): ModifyIdFormatRequestOps =
    new ModifyIdFormatRequestOps(v)

}
