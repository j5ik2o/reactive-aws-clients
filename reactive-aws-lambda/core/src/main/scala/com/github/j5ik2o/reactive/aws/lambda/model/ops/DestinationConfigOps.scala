// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DestinationConfigBuilderOps(val self: DestinationConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onSuccessAsScala(value: Option[OnSuccess]): DestinationConfig.Builder = {
    value.fold(self) { v =>
      self.onSuccess(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onFailureAsScala(value: Option[OnFailure]): DestinationConfig.Builder = {
    value.fold(self) { v =>
      self.onFailure(v)
    }
  }

}

final class DestinationConfigOps(val self: DestinationConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onSuccessAsScala: Option[OnSuccess] = Option(self.onSuccess)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onFailureAsScala: Option[OnFailure] = Option(self.onFailure)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationConfigOps {

  implicit def toDestinationConfigBuilderOps(v: DestinationConfig.Builder): DestinationConfigBuilderOps =
    new DestinationConfigBuilderOps(v)

  implicit def toDestinationConfigOps(v: DestinationConfig): DestinationConfigOps = new DestinationConfigOps(v)

}
