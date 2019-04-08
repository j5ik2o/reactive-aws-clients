// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateApplicationResponseBuilderOps(val self: CreateApplicationResponse.Builder) extends AnyVal {

  final def applicationAsScala(value: Option[ApplicationDescription]): CreateApplicationResponse.Builder = {
    value.fold(self) { v =>
      self.application(v)
    }
  } // ApplicationDescription

}

final class CreateApplicationResponseOps(val self: CreateApplicationResponse) extends AnyVal {

  final def applicationAsScala: Option[ApplicationDescription] = Option(self.application) // ApplicationDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApplicationResponseOps {

  implicit def toCreateApplicationResponseBuilderOps(
      v: CreateApplicationResponse.Builder
  ): CreateApplicationResponseBuilderOps = new CreateApplicationResponseBuilderOps(v)

  implicit def toCreateApplicationResponseOps(v: CreateApplicationResponse): CreateApplicationResponseOps =
    new CreateApplicationResponseOps(v)

}
