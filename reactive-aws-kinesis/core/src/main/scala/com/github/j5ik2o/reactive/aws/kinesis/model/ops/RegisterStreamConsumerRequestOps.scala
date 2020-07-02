// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RegisterStreamConsumerRequestBuilderOps(val self: RegisterStreamConsumerRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala(value: Option[String]): RegisterStreamConsumerRequest.Builder = {
    value.fold(self) { v => self.streamARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala(value: Option[String]): RegisterStreamConsumerRequest.Builder = {
    value.fold(self) { v => self.consumerName(v) }
  }

}

final class RegisterStreamConsumerRequestOps(val self: RegisterStreamConsumerRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterStreamConsumerRequestOps {

  implicit def toRegisterStreamConsumerRequestBuilderOps(
      v: RegisterStreamConsumerRequest.Builder
  ): RegisterStreamConsumerRequestBuilderOps = new RegisterStreamConsumerRequestBuilderOps(v)

  implicit def toRegisterStreamConsumerRequestOps(v: RegisterStreamConsumerRequest): RegisterStreamConsumerRequestOps =
    new RegisterStreamConsumerRequestOps(v)

}
