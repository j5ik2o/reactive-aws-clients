// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RegisterStreamConsumerResponseBuilderOps(val self: RegisterStreamConsumerResponse.Builder) extends AnyVal {

  final def consumerAsScala(value: Option[Consumer]): RegisterStreamConsumerResponse.Builder = {
    value.fold(self) { v =>
      self.consumer(v)
    }
  }

}

final class RegisterStreamConsumerResponseOps(val self: RegisterStreamConsumerResponse) extends AnyVal {

  final def consumerAsScala: Option[Consumer] = Option(self.consumer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterStreamConsumerResponseOps {

  implicit def toRegisterStreamConsumerResponseBuilderOps(
      v: RegisterStreamConsumerResponse.Builder
  ): RegisterStreamConsumerResponseBuilderOps = new RegisterStreamConsumerResponseBuilderOps(v)

  implicit def toRegisterStreamConsumerResponseOps(
      v: RegisterStreamConsumerResponse
  ): RegisterStreamConsumerResponseOps = new RegisterStreamConsumerResponseOps(v)

}
