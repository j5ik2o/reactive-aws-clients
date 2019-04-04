// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordRequestBuilderOps(val self: PutRecordRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withDataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.data(v)
    }
  } // SdkBytes

  final def withPartitionKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.partitionKey(v)
    }
  } // String

  final def withExplicitHashKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.explicitHashKey(v)
    }
  } // String

  final def withSequenceNumberForOrderingAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberForOrdering(v)
    }
  } // String

}

final class PutRecordRequestOps(val self: PutRecordRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.data) // SdkBytes

  final def partitionKeyAsScala: Option[String] = Option(self.partitionKey) // String

  final def explicitHashKeyAsScala: Option[String] = Option(self.explicitHashKey) // String

  final def sequenceNumberForOrderingAsScala: Option[String] = Option(self.sequenceNumberForOrdering) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordRequestOps {

  implicit def toPutRecordRequestBuilderOps(v: PutRecordRequest.Builder): PutRecordRequestBuilderOps =
    new PutRecordRequestBuilderOps(v)

  implicit def toPutRecordRequestOps(v: PutRecordRequest): PutRecordRequestOps = new PutRecordRequestOps(v)

}
