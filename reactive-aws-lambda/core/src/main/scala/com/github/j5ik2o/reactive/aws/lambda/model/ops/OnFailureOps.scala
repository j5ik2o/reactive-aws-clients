// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class OnFailureBuilderOps(val self: OnFailure.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[String]): OnFailure.Builder = {
    value.fold(self) { v => self.destination(v) }
  }

}

final class OnFailureOps(val self: OnFailure) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[String] = Option(self.destination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOnFailureOps {

  implicit def toOnFailureBuilderOps(v: OnFailure.Builder): OnFailureBuilderOps = new OnFailureBuilderOps(v)

  implicit def toOnFailureOps(v: OnFailure): OnFailureOps = new OnFailureOps(v)

}
