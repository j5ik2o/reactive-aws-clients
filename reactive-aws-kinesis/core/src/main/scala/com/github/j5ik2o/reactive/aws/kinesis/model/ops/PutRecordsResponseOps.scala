// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsResponseBuilderOps(val self: PutRecordsResponse.Builder) extends AnyVal {

  final def withFailedRecordCountAsScala(value: Option[Int]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.failedRecordCount(v)
    }
  } // Int

  final def withRecordsAsScala(value: Option[Seq[PutRecordsResultEntry]]): PutRecordsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.records(v.asJava)
    } // Seq[PutRecordsResultEntry]
  }

  final def withEncryptionTypeAsScala(value: Option[EncryptionType]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  } // String

}

final class PutRecordsResponseOps(val self: PutRecordsResponse) extends AnyVal {

  final def failedRecordCountAsScala: Option[Int] = Option(self.failedRecordCount) // Int

  final def recordsAsScala: Option[Seq[PutRecordsResultEntry]] = Option(self.records).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[PutRecordsResultEntry]

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsResponseOps {

  implicit def toPutRecordsResponseBuilderOps(v: PutRecordsResponse.Builder): PutRecordsResponseBuilderOps =
    new PutRecordsResponseBuilderOps(v)

  implicit def toPutRecordsResponseOps(v: PutRecordsResponse): PutRecordsResponseOps = new PutRecordsResponseOps(v)

}
