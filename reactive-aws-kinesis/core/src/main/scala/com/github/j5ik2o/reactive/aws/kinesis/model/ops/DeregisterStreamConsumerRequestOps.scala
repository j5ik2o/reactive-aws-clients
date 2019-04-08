// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DeregisterStreamConsumerRequestBuilderOps(val self: DeregisterStreamConsumerRequest.Builder)
    extends AnyVal {

  final def streamARNAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

  final def consumerNameAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  }

  final def consumerARNAsScala(value: Option[String]): DeregisterStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  }

}

final class DeregisterStreamConsumerRequestOps(val self: DeregisterStreamConsumerRequest) extends AnyVal {

  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterStreamConsumerRequestOps {

  implicit def toDeregisterStreamConsumerRequestBuilderOps(
      v: DeregisterStreamConsumerRequest.Builder
  ): DeregisterStreamConsumerRequestBuilderOps = new DeregisterStreamConsumerRequestBuilderOps(v)

  implicit def toDeregisterStreamConsumerRequestOps(
      v: DeregisterStreamConsumerRequest
  ): DeregisterStreamConsumerRequestOps = new DeregisterStreamConsumerRequestOps(v)

}
