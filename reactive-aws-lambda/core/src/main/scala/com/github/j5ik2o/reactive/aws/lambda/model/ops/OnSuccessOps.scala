// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class OnSuccessBuilderOps(val self: OnSuccess.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[String]): OnSuccess.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  }

}

final class OnSuccessOps(val self: OnSuccess) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[String] = Option(self.destination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOnSuccessOps {

  implicit def toOnSuccessBuilderOps(v: OnSuccess.Builder): OnSuccessBuilderOps = new OnSuccessBuilderOps(v)

  implicit def toOnSuccessOps(v: OnSuccess): OnSuccessOps = new OnSuccessOps(v)

}
