// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordRequestBuilderOps(val self: PutRecordRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def dataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.data(v)
    }
  }

  final def partitionKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.partitionKey(v)
    }
  }

  final def explicitHashKeyAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.explicitHashKey(v)
    }
  }

  final def sequenceNumberForOrderingAsScala(value: Option[String]): PutRecordRequest.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberForOrdering(v)
    }
  }

}

final class PutRecordRequestOps(val self: PutRecordRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.data)

  final def partitionKeyAsScala: Option[String] = Option(self.partitionKey)

  final def explicitHashKeyAsScala: Option[String] = Option(self.explicitHashKey)

  final def sequenceNumberForOrderingAsScala: Option[String] = Option(self.sequenceNumberForOrdering)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordRequestOps {

  implicit def toPutRecordRequestBuilderOps(v: PutRecordRequest.Builder): PutRecordRequestBuilderOps =
    new PutRecordRequestBuilderOps(v)

  implicit def toPutRecordRequestOps(v: PutRecordRequest): PutRecordRequestOps = new PutRecordRequestOps(v)

}
