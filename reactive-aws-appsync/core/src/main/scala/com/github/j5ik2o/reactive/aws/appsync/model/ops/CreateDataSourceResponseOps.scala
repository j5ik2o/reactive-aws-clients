// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateDataSourceResponseBuilderOps(val self: CreateDataSourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala(value: Option[DataSource]): CreateDataSourceResponse.Builder = {
    value.fold(self) { v =>
      self.dataSource(v)
    }
  }

}

final class CreateDataSourceResponseOps(val self: CreateDataSourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala: Option[DataSource] = Option(self.dataSource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDataSourceResponseOps {

  implicit def toCreateDataSourceResponseBuilderOps(
      v: CreateDataSourceResponse.Builder
  ): CreateDataSourceResponseBuilderOps = new CreateDataSourceResponseBuilderOps(v)

  implicit def toCreateDataSourceResponseOps(v: CreateDataSourceResponse): CreateDataSourceResponseOps =
    new CreateDataSourceResponseOps(v)

}
