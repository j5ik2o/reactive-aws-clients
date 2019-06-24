// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateGlobalSecondaryIndexActionBuilderOps(val self: UpdateGlobalSecondaryIndexAction.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): UpdateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala(
      value: Option[ProvisionedThroughput]
  ): UpdateGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v =>
      self.provisionedThroughput(v)
    }
  }

}

final class UpdateGlobalSecondaryIndexActionOps(val self: UpdateGlobalSecondaryIndexAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput)

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
