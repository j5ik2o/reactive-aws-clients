// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalSecondaryIndexActionBuilderOps(val self: UpdateGlobalSecondaryIndexAction.Builder)
    extends AnyVal {

  final def withIndexNameAsScala(value: Option[String]): UpdateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  } // String

  final def withProvisionedThroughputAsScala(
      value: Option[ProvisionedThroughput]
  ): UpdateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  } // ProvisionedThroughput

}

final class UpdateGlobalSecondaryIndexActionOps(val self: UpdateGlobalSecondaryIndexAction) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName) // String

  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] =
    Option(self.provisionedThroughput) // ProvisionedThroughput

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateGlobalSecondaryIndexActionOps {

  implicit def toUpdateGlobalSecondaryIndexActionBuilderOps(
      v: UpdateGlobalSecondaryIndexAction.Builder
  ): UpdateGlobalSecondaryIndexActionBuilderOps = new UpdateGlobalSecondaryIndexActionBuilderOps(v)

  implicit def toUpdateGlobalSecondaryIndexActionOps(
      v: UpdateGlobalSecondaryIndexAction
  ): UpdateGlobalSecondaryIndexActionOps = new UpdateGlobalSecondaryIndexActionOps(v)

}
