// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteGlobalSecondaryIndexActionBuilderOps(val self: DeleteGlobalSecondaryIndexAction.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala(value: Option[String]): DeleteGlobalSecondaryIndexAction.Builder = {
    value.fold(self) { v => self.indexName(v) }
  }

}

final class DeleteGlobalSecondaryIndexActionOps(val self: DeleteGlobalSecondaryIndexAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexNameAsScala: Option[String] = Option(self.indexName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteGlobalSecondaryIndexActionOps {

  implicit def toDeleteGlobalSecondaryIndexActionBuilderOps(
      v: DeleteGlobalSecondaryIndexAction.Builder
  ): DeleteGlobalSecondaryIndexActionBuilderOps = new DeleteGlobalSecondaryIndexActionBuilderOps(v)

  implicit def toDeleteGlobalSecondaryIndexActionOps(
      v: DeleteGlobalSecondaryIndexAction
  ): DeleteGlobalSecondaryIndexActionOps = new DeleteGlobalSecondaryIndexActionOps(v)

}
