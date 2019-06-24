// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteDataSourceRequestBuilderOps(val self: DeleteDataSourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): DeleteDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DeleteDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class DeleteDataSourceRequestOps(val self: DeleteDataSourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDataSourceRequestOps {

  implicit def toDeleteDataSourceRequestBuilderOps(
      v: DeleteDataSourceRequest.Builder
  ): DeleteDataSourceRequestBuilderOps = new DeleteDataSourceRequestBuilderOps(v)

  implicit def toDeleteDataSourceRequestOps(v: DeleteDataSourceRequest): DeleteDataSourceRequestOps =
    new DeleteDataSourceRequestOps(v)

}
