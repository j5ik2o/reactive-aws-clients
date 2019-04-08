// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordRequestBuilderOps(val self: PutRecordRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def dataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.data(v)
    }
  } // software.amazon.awssdk.core.SdkBytes

  final def partitionKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.partitionKey(v)
    }
  } // String

  final def explicitHashKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.explicitHashKey(v)
    }
  } // String

  final def sequenceNumberForOrderingAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberForOrdering(v)
    }
  } // String

}

final class PutRecordRequestOps(val self: PutRecordRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] =
    Option(self.data) // software.amazon.awssdk.core.SdkBytes

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
