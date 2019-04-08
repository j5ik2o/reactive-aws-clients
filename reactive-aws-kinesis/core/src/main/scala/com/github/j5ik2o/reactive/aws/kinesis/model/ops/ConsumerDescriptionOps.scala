// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerDescriptionBuilderOps(val self: ConsumerDescription.Builder) extends AnyVal {

  final def consumerNameAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  }

  final def consumerARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  }

  final def consumerStatusAsScala(value: Option[ConsumerStatus]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerStatus(v)
    }
  }

  final def consumerCreationTimestampAsScala(value: Option[java.time.Instant]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerCreationTimestamp(v)
    }
  }

  final def streamARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

}

final class ConsumerDescriptionOps(val self: ConsumerDescription) extends AnyVal {

  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus)

  final def consumerCreationTimestampAsScala: Option[java.time.Instant] = Option(self.consumerCreationTimestamp)

  final def streamARNAsScala: Option[String] = Option(self.streamARN)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerDescriptionOps {

  implicit def toConsumerDescriptionBuilderOps(v: ConsumerDescription.Builder): ConsumerDescriptionBuilderOps =
    new ConsumerDescriptionBuilderOps(v)

  implicit def toConsumerDescriptionOps(v: ConsumerDescription): ConsumerDescriptionOps = new ConsumerDescriptionOps(v)

}
