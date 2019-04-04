// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsResultEntryBuilderOps(val self: PutRecordsResultEntry.Builder) extends AnyVal {

  final def withSequenceNumberAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

  final def withShardIdAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  } // String

  final def withErrorCodeAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  } // String

  final def withErrorMessageAsScala(value: Option[String]): PutRecordsResultEntry.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  } // String

}

final class PutRecordsResultEntryOps(val self: PutRecordsResultEntry) extends AnyVal {

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

  final def shardIdAsScala: Option[String] = Option(self.shardId) // String

  final def errorCodeAsScala: Option[String] = Option(self.errorCode) // String

  final def errorMessageAsScala: Option[String] = Option(self.errorMessage) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsResultEntryOps {

  implicit def toPutRecordsResultEntryBuilderOps(v: PutRecordsResultEntry.Builder): PutRecordsResultEntryBuilderOps =
    new PutRecordsResultEntryBuilderOps(v)

  implicit def toPutRecordsResultEntryOps(v: PutRecordsResultEntry): PutRecordsResultEntryOps =
    new PutRecordsResultEntryOps(v)

}
