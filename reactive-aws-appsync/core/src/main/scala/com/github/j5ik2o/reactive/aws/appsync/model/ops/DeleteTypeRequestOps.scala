// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteTypeRequestBuilderOps(val self: DeleteTypeRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): DeleteTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withTypeNameAsScala(value: Option[String]): DeleteTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  } // String

}

final class DeleteTypeRequestOps(val self: DeleteTypeRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def typeNameAsScala: Option[String] = Option(self.typeName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTypeRequestOps {

  implicit def toDeleteTypeRequestBuilderOps(v: DeleteTypeRequest.Builder): DeleteTypeRequestBuilderOps =
    new DeleteTypeRequestBuilderOps(v)

  implicit def toDeleteTypeRequestOps(v: DeleteTypeRequest): DeleteTypeRequestOps = new DeleteTypeRequestOps(v)

}
