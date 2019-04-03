// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeLimitsResponseBuilderOps(val self: DescribeLimitsResponse.Builder) extends AnyVal {

  final def withAccountMaxReadCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.accountMaxReadCapacityUnits(v)
    }
  } // Long

  final def withAccountMaxWriteCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.accountMaxWriteCapacityUnits(v)
    }
  } // Long

  final def withTableMaxReadCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.tableMaxReadCapacityUnits(v)
    }
  } // Long

  final def withTableMaxWriteCapacityUnitsAsScala(value: Option[Long]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.tableMaxWriteCapacityUnits(v)
    }
  } // Long

}

final class DescribeLimitsResponseOps(val self: DescribeLimitsResponse) extends AnyVal {

  final def accountMaxReadCapacityUnitsAsScala: Option[Long] = Option(self.accountMaxReadCapacityUnits) // Long

  final def accountMaxWriteCapacityUnitsAsScala: Option[Long] = Option(self.accountMaxWriteCapacityUnits) // Long

  final def tableMaxReadCapacityUnitsAsScala: Option[Long] = Option(self.tableMaxReadCapacityUnits) // Long

  final def tableMaxWriteCapacityUnitsAsScala: Option[Long] = Option(self.tableMaxWriteCapacityUnits) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLimitsResponseOps {

  implicit def toDescribeLimitsResponseBuilderOps(v: DescribeLimitsResponse.Builder): DescribeLimitsResponseBuilderOps =
    new DescribeLimitsResponseBuilderOps(v)

  implicit def toDescribeLimitsResponseOps(v: DescribeLimitsResponse): DescribeLimitsResponseOps =
    new DescribeLimitsResponseOps(v)

}
