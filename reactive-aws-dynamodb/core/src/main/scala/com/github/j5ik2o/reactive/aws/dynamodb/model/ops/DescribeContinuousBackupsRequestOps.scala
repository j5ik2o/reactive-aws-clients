// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeContinuousBackupsRequestBuilderOps(val self: DescribeContinuousBackupsRequest.Builder)
    extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): DescribeContinuousBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

}

final class DescribeContinuousBackupsRequestOps(val self: DescribeContinuousBackupsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeContinuousBackupsRequestOps {

  implicit def toDescribeContinuousBackupsRequestBuilderOps(
      v: DescribeContinuousBackupsRequest.Builder
  ): DescribeContinuousBackupsRequestBuilderOps = new DescribeContinuousBackupsRequestBuilderOps(v)

  implicit def toDescribeContinuousBackupsRequestOps(
      v: DescribeContinuousBackupsRequest
  ): DescribeContinuousBackupsRequestOps = new DescribeContinuousBackupsRequestOps(v)

}
