// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsRequestBuilderOps(val self: PutRecordsRequest.Builder) extends AnyVal {

  final def recordsAsScala(value: Option[Seq[PutRecordsRequestEntry]]): PutRecordsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.records(v.asJava)
    } // Seq[PutRecordsRequestEntry]
  }

  final def streamNameAsScala(value: Option[String]): PutRecordsRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

}

final class PutRecordsRequestOps(val self: PutRecordsRequest) extends AnyVal {

  final def recordsAsScala: Option[Seq[PutRecordsRequestEntry]] = Option(self.records).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[PutRecordsRequestEntry]

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsRequestOps {

  implicit def toPutRecordsRequestBuilderOps(v: PutRecordsRequest.Builder): PutRecordsRequestBuilderOps =
    new PutRecordsRequestBuilderOps(v)

  implicit def toPutRecordsRequestOps(v: PutRecordsRequest): PutRecordsRequestOps = new PutRecordsRequestOps(v)

}
