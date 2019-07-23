// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CreateTableResponseBuilderOps(val self: CreateTableResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala(value: Option[TableDescription]): CreateTableResponse.Builder = {
    value.fold(self) { v =>
      self.tableDescription(v)
    }
  }

}

final class CreateTableResponseOps(val self: CreateTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTableResponseOps {

  implicit def toCreateTableResponseBuilderOps(v: CreateTableResponse.Builder): CreateTableResponseBuilderOps =
    new CreateTableResponseBuilderOps(v)

  implicit def toCreateTableResponseOps(v: CreateTableResponse): CreateTableResponseOps = new CreateTableResponseOps(v)

}
