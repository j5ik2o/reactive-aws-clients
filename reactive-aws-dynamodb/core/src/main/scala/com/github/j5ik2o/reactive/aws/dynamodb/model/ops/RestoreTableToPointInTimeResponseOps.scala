// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableToPointInTimeResponseBuilderOps(val self: RestoreTableToPointInTimeResponse.Builder)
    extends AnyVal {

  final def withTableDescriptionAsScala(value: Option[TableDescription]): RestoreTableToPointInTimeResponse.Builder = {
    value.fold(self) { v =>
      self.tableDescription(v)
    }
  } // TableDescription

}

final class RestoreTableToPointInTimeResponseOps(val self: RestoreTableToPointInTimeResponse) extends AnyVal {

  final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription) // TableDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableToPointInTimeResponseOps {

  implicit def toRestoreTableToPointInTimeResponseBuilderOps(
      v: RestoreTableToPointInTimeResponse.Builder
  ): RestoreTableToPointInTimeResponseBuilderOps = new RestoreTableToPointInTimeResponseBuilderOps(v)

  implicit def toRestoreTableToPointInTimeResponseOps(
      v: RestoreTableToPointInTimeResponse
  ): RestoreTableToPointInTimeResponseOps = new RestoreTableToPointInTimeResponseOps(v)

}
