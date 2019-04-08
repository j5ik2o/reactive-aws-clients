// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteTableRequestBuilderOps(val self: DeleteTableRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): DeleteTableRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

}

final class DeleteTableRequestOps(val self: DeleteTableRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTableRequestOps {

  implicit def toDeleteTableRequestBuilderOps(v: DeleteTableRequest.Builder): DeleteTableRequestBuilderOps =
    new DeleteTableRequestBuilderOps(v)

  implicit def toDeleteTableRequestOps(v: DeleteTableRequest): DeleteTableRequestOps = new DeleteTableRequestOps(v)

}
