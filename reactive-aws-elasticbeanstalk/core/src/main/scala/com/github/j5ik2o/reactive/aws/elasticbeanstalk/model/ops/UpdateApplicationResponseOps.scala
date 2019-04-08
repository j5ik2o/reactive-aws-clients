// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationResponseBuilderOps(val self: UpdateApplicationResponse.Builder) extends AnyVal {

  final def applicationAsScala(value: Option[ApplicationDescription]): UpdateApplicationResponse.Builder = {
    value.fold(self) { v =>
      self.application(v)
    }
  } // ApplicationDescription

}

final class UpdateApplicationResponseOps(val self: UpdateApplicationResponse) extends AnyVal {

  final def applicationAsScala: Option[ApplicationDescription] = Option(self.application) // ApplicationDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationResponseOps {

  implicit def toUpdateApplicationResponseBuilderOps(
      v: UpdateApplicationResponse.Builder
  ): UpdateApplicationResponseBuilderOps = new UpdateApplicationResponseBuilderOps(v)

  implicit def toUpdateApplicationResponseOps(v: UpdateApplicationResponse): UpdateApplicationResponseOps =
    new UpdateApplicationResponseOps(v)

}
