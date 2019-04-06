// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateTypeResponseBuilderOps(val self: UpdateTypeResponse.Builder) extends AnyVal {

  final def withTypeAsScala(value: Option[Type]): UpdateTypeResponse.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // Type

}

final class UpdateTypeResponseOps(val self: UpdateTypeResponse) extends AnyVal {

  final def typeAsScala: Option[Type] = Option(self.`type`) // Type

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTypeResponseOps {

  implicit def toUpdateTypeResponseBuilderOps(v: UpdateTypeResponse.Builder): UpdateTypeResponseBuilderOps =
    new UpdateTypeResponseBuilderOps(v)

  implicit def toUpdateTypeResponseOps(v: UpdateTypeResponse): UpdateTypeResponseOps = new UpdateTypeResponseOps(v)

}
