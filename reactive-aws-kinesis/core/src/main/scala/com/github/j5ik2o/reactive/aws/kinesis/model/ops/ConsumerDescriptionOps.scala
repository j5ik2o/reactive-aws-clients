// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerDescriptionBuilderOps(val self: ConsumerDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v => self.consumerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v => self.consumerARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerStatusAsScala(value: Option[ConsumerStatus]): ConsumerDescription.Builder = {
    value.fold(self) { v => self.consumerStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerCreationTimestampAsScala(value: Option[java.time.Instant]): ConsumerDescription.Builder = {
    value.fold(self) { v => self.consumerCreationTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v => self.streamARN(v) }
  }

}

final class ConsumerDescriptionOps(val self: ConsumerDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerCreationTimestampAsScala: Option[java.time.Instant] = Option(self.consumerCreationTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamARNAsScala: Option[String] = Option(self.streamARN)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerDescriptionOps {

  implicit def toConsumerDescriptionBuilderOps(v: ConsumerDescription.Builder): ConsumerDescriptionBuilderOps =
    new ConsumerDescriptionBuilderOps(v)

  implicit def toConsumerDescriptionOps(v: ConsumerDescription): ConsumerDescriptionOps = new ConsumerDescriptionOps(v)

}
