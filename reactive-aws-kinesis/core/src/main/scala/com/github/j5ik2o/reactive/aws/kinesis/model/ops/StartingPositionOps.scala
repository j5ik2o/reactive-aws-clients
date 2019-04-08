// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StartingPositionBuilderOps(val self: StartingPosition.Builder) extends AnyVal {

  final def typeAsScala(value: Option[ShardIteratorType]): StartingPosition.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // ShardIteratorType

  final def sequenceNumberAsScala(value: Option[String]): StartingPosition.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

  final def timestampAsScala(value: Option[java.time.Instant]): StartingPosition.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

}

final class StartingPositionOps(val self: StartingPosition) extends AnyVal {

  final def typeAsScala: Option[ShardIteratorType] = Option(self.`type`) // ShardIteratorType

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartingPositionOps {

  implicit def toStartingPositionBuilderOps(v: StartingPosition.Builder): StartingPositionBuilderOps =
    new StartingPositionBuilderOps(v)

  implicit def toStartingPositionOps(v: StartingPosition): StartingPositionOps = new StartingPositionOps(v)

}
