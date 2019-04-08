// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteTableResponseBuilderOps(val self: DeleteTableResponse.Builder) extends AnyVal {

  final def tableDescriptionAsScala(value: Option[TableDescription]): DeleteTableResponse.Builder = {
    value.fold(self) { v =>
      self.tableDescription(v)
    }
  } // TableDescription

}

final class DeleteTableResponseOps(val self: DeleteTableResponse) extends AnyVal {

  final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription) // TableDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTableResponseOps {

  implicit def toDeleteTableResponseBuilderOps(v: DeleteTableResponse.Builder): DeleteTableResponseBuilderOps =
    new DeleteTableResponseBuilderOps(v)

  implicit def toDeleteTableResponseOps(v: DeleteTableResponse): DeleteTableResponseOps = new DeleteTableResponseOps(v)

}
