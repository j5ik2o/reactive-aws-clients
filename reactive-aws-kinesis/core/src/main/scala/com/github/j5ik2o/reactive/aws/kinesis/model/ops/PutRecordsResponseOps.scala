// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsResponseBuilderOps(val self: PutRecordsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedRecordCountAsScala(value: Option[Int]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.failedRecordCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala(value: Option[Seq[PutRecordsResultEntry]]): PutRecordsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.records(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala(value: Option[EncryptionType]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

}

final class PutRecordsResponseOps(val self: PutRecordsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedRecordCountAsScala: Option[Int] = Option(self.failedRecordCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala: Option[Seq[PutRecordsResultEntry]] = Option(self.records).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsResponseOps {

  implicit def toPutRecordsResponseBuilderOps(v: PutRecordsResponse.Builder): PutRecordsResponseBuilderOps =
    new PutRecordsResponseBuilderOps(v)

  implicit def toPutRecordsResponseOps(v: PutRecordsResponse): PutRecordsResponseOps = new PutRecordsResponseOps(v)

}
