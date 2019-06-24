// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetDataSourceResponseBuilderOps(val self: GetDataSourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala(value: Option[DataSource]): GetDataSourceResponse.Builder = {
    value.fold(self) { v =>
      self.dataSource(v)
    }
  }

}

final class GetDataSourceResponseOps(val self: GetDataSourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala: Option[DataSource] = Option(self.dataSource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDataSourceResponseOps {

  implicit def toGetDataSourceResponseBuilderOps(v: GetDataSourceResponse.Builder): GetDataSourceResponseBuilderOps =
    new GetDataSourceResponseBuilderOps(v)

  implicit def toGetDataSourceResponseOps(v: GetDataSourceResponse): GetDataSourceResponseOps =
    new GetDataSourceResponseOps(v)

}
