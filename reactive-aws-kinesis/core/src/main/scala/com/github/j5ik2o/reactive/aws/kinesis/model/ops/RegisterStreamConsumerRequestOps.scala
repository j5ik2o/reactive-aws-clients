// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RegisterStreamConsumerRequestBuilderOps(val self: RegisterStreamConsumerRequest.Builder) extends AnyVal {

  final def streamARNAsScala(value: Option[String]): RegisterStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  } // String

  final def consumerNameAsScala(value: Option[String]): RegisterStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  } // String

}

final class RegisterStreamConsumerRequestOps(val self: RegisterStreamConsumerRequest) extends AnyVal {

  final def streamARNAsScala: Option[String] = Option(self.streamARN) // String

  final def consumerNameAsScala: Option[String] = Option(self.consumerName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterStreamConsumerRequestOps {

  implicit def toRegisterStreamConsumerRequestBuilderOps(
      v: RegisterStreamConsumerRequest.Builder
  ): RegisterStreamConsumerRequestBuilderOps = new RegisterStreamConsumerRequestBuilderOps(v)

  implicit def toRegisterStreamConsumerRequestOps(v: RegisterStreamConsumerRequest): RegisterStreamConsumerRequestOps =
    new RegisterStreamConsumerRequestOps(v)

}
