// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerBuilderOps(val self: Consumer.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v => self.consumerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerARNAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v => self.consumerARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerStatusAsScala(value: Option[ConsumerStatus]): Consumer.Builder = {
    value.fold(self) { v => self.consumerStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerCreationTimestampAsScala(value: Option[java.time.Instant]): Consumer.Builder = {
    value.fold(self) { v => self.consumerCreationTimestamp(v) }
  }

}

final class ConsumerOps(val self: Consumer) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerCreationTimestampAsScala: Option[java.time.Instant] = Option(self.consumerCreationTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerOps {

  implicit def toConsumerBuilderOps(v: Consumer.Builder): ConsumerBuilderOps = new ConsumerBuilderOps(v)

  implicit def toConsumerOps(v: Consumer): ConsumerOps = new ConsumerOps(v)

}
