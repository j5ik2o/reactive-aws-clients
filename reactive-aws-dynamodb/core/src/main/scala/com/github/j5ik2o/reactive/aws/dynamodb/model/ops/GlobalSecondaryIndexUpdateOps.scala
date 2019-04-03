// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexUpdateBuilderOps(val self: GlobalSecondaryIndexUpdate.Builder) extends AnyVal {

  final def withUpdateAsScala(value: Option[UpdateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  } // UpdateGlobalSecondaryIndexAction

  final def withCreateAsScala(value: Option[CreateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.create(v)
    }
  } // CreateGlobalSecondaryIndexAction

  final def withDeleteAsScala(value: Option[DeleteGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  } // DeleteGlobalSecondaryIndexAction

}

final class GlobalSecondaryIndexUpdateOps(val self: GlobalSecondaryIndexUpdate) extends AnyVal {

  final def updateAsScala: Option[UpdateGlobalSecondaryIndexAction] =
    Option(self.update) // UpdateGlobalSecondaryIndexAction

  final def createAsScala: Option[CreateGlobalSecondaryIndexAction] =
    Option(self.create) // CreateGlobalSecondaryIndexAction

  final def deleteAsScala: Option[DeleteGlobalSecondaryIndexAction] =
    Option(self.delete) // DeleteGlobalSecondaryIndexAction

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexUpdateOps {

  implicit def toGlobalSecondaryIndexUpdateBuilderOps(
      v: GlobalSecondaryIndexUpdate.Builder
  ): GlobalSecondaryIndexUpdateBuilderOps = new GlobalSecondaryIndexUpdateBuilderOps(v)

  implicit def toGlobalSecondaryIndexUpdateOps(v: GlobalSecondaryIndexUpdate): GlobalSecondaryIndexUpdateOps =
    new GlobalSecondaryIndexUpdateOps(v)

}
