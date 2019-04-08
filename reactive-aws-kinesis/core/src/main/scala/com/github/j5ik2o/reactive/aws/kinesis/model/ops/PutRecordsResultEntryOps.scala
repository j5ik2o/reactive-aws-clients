// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsResultEntryBuilderOps(val self: PutRecordsResultEntry.Builder) extends AnyVal {

  final def sequenceNumberAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  }

  final def shardIdAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  }

  final def errorCodeAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  }

  final def errorMessageAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  }

}

final class PutRecordsResultEntryOps(val self: PutRecordsResultEntry) extends AnyVal {

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def errorCodeAsScala: Option[String] = Option(self.errorCode)

  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsResultEntryOps {

  implicit def toPutRecordsResultEntryBuilderOps(v: PutRecordsResultEntry.Builder): PutRecordsResultEntryBuilderOps =
    new PutRecordsResultEntryBuilderOps(v)

  implicit def toPutRecordsResultEntryOps(v: PutRecordsResultEntry): PutRecordsResultEntryOps =
    new PutRecordsResultEntryOps(v)

}
