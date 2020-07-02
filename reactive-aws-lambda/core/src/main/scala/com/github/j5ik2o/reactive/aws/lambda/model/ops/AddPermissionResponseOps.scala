// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddPermissionResponseBuilderOps(val self: AddPermissionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementAsScala(value: Option[String]): AddPermissionResponse.Builder = {
    value.fold(self) { v => self.statement(v) }
  }

}

final class AddPermissionResponseOps(val self: AddPermissionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statementAsScala: Option[String] = Option(self.statement)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionResponseOps {

  implicit def toAddPermissionResponseBuilderOps(v: AddPermissionResponse.Builder): AddPermissionResponseBuilderOps =
    new AddPermissionResponseBuilderOps(v)

  implicit def toAddPermissionResponseOps(v: AddPermissionResponse): AddPermissionResponseOps =
    new AddPermissionResponseOps(v)

}
