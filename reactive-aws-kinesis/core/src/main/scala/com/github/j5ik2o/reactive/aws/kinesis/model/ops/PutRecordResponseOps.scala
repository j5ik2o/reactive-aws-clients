// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordResponseBuilderOps(val self: PutRecordResponse.Builder) extends AnyVal {

  final def shardIdAsScala(value: Option[String]): PutRecordResponse.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  } // String

  final def sequenceNumberAsScala(value: Option[String]): PutRecordResponse.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

  final def encryptionTypeAsScala(value: Option[EncryptionType]): PutRecordResponse.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // String

}

final class PutRecordResponseOps(val self: PutRecordResponse) extends AnyVal {

  final def shardIdAsScala: Option[String] = Option(self.shardId) // String

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordResponseOps {

  implicit def toPutRecordResponseBuilderOps(v: PutRecordResponse.Builder): PutRecordResponseBuilderOps =
    new PutRecordResponseBuilderOps(v)

  implicit def toPutRecordResponseOps(v: PutRecordResponse): PutRecordResponseOps = new PutRecordResponseOps(v)

}
