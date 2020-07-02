// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CancelUpdateStackRequestBuilderOps(val self: CancelUpdateStackRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): CancelUpdateStackRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): CancelUpdateStackRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

}

final class CancelUpdateStackRequestOps(val self: CancelUpdateStackRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelUpdateStackRequestOps {

  implicit def toCancelUpdateStackRequestBuilderOps(
      v: CancelUpdateStackRequest.Builder
  ): CancelUpdateStackRequestBuilderOps = new CancelUpdateStackRequestBuilderOps(v)

  implicit def toCancelUpdateStackRequestOps(v: CancelUpdateStackRequest): CancelUpdateStackRequestOps =
    new CancelUpdateStackRequestOps(v)

}
