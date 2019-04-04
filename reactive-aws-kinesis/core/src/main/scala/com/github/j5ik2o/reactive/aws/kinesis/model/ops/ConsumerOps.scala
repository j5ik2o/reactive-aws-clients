// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerBuilderOps(val self: Consumer.Builder) extends AnyVal {

  final def withConsumerNameAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  } // String

  final def withConsumerARNAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  } // String

  final def withConsumerStatusAsScala(value: Option[ConsumerStatus]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerStatus(v)
    }
  } // String

  final def withConsumerCreationTimestampAsScala(value: Option[java.time.Instant]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerCreationTimestamp(v)
    }
  } // Instant

}

final class ConsumerOps(val self: Consumer) extends AnyVal {

  final def consumerNameAsScala: Option[String] = Option(self.consumerName) // String

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN) // String

  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus) // String

  final def consumerCreationTimestampAsScala: Option[java.time.Instant] =
    Option(self.consumerCreationTimestamp) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerOps {

  implicit def toConsumerBuilderOps(v: Consumer.Builder): ConsumerBuilderOps = new ConsumerBuilderOps(v)

  implicit def toConsumerOps(v: Consumer): ConsumerOps = new ConsumerOps(v)

}
