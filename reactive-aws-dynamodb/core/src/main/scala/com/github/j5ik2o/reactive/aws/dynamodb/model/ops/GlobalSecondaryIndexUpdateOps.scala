// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalSecondaryIndexUpdateBuilderOps(val self: GlobalSecondaryIndexUpdate.Builder) extends AnyVal {

  final def updateAsScala(value: Option[UpdateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.update(v)
    }
  }

  final def createAsScala(value: Option[CreateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.create(v)
    }
  }

  final def deleteAsScala(value: Option[DeleteGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  }

}

final class GlobalSecondaryIndexUpdateOps(val self: GlobalSecondaryIndexUpdate) extends AnyVal {

  final def updateAsScala: Option[UpdateGlobalSecondaryIndexAction] = Option(self.update)

  final def createAsScala: Option[CreateGlobalSecondaryIndexAction] = Option(self.create)

  final def deleteAsScala: Option[DeleteGlobalSecondaryIndexAction] = Option(self.delete)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalSecondaryIndexUpdateOps {

  implicit def toGlobalSecondaryIndexUpdateBuilderOps(
      v: GlobalSecondaryIndexUpdate.Builder
  ): GlobalSecondaryIndexUpdateBuilderOps = new GlobalSecondaryIndexUpdateBuilderOps(v)

  implicit def toGlobalSecondaryIndexUpdateOps(v: GlobalSecondaryIndexUpdate): GlobalSecondaryIndexUpdateOps =
    new GlobalSecondaryIndexUpdateOps(v)

}
