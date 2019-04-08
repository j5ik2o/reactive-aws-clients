// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeLimitsResponseBuilderOps(val self: DescribeLimitsResponse.Builder) extends AnyVal {

  final def accountMaxReadCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.accountMaxReadCapacityUnits(v)
    }
  }

  final def accountMaxWriteCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.accountMaxWriteCapacityUnits(v)
    }
  }

  final def tableMaxReadCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.tableMaxReadCapacityUnits(v)
    }
  }

  final def tableMaxWriteCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.tableMaxWriteCapacityUnits(v)
    }
  }

}

final class DescribeLimitsResponseOps(val self: DescribeLimitsResponse) extends AnyVal {

  final def accountMaxReadCapacityUnitsAsScala: Option[Long] = Option(self.accountMaxReadCapacityUnits)

  final def accountMaxWriteCapacityUnitsAsScala: Option[Long] = Option(self.accountMaxWriteCapacityUnits)

  final def tableMaxReadCapacityUnitsAsScala: Option[Long] = Option(self.tableMaxReadCapacityUnits)

  final def tableMaxWriteCapacityUnitsAsScala: Option[Long] = Option(self.tableMaxWriteCapacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLimitsResponseOps {

  implicit def toDescribeLimitsResponseBuilderOps(v: DescribeLimitsResponse.Builder): DescribeLimitsResponseBuilderOps =
    new DescribeLimitsResponseBuilderOps(v)

  implicit def toDescribeLimitsResponseOps(v: DescribeLimitsResponse): DescribeLimitsResponseOps =
    new DescribeLimitsResponseOps(v)

}
