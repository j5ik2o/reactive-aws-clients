// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateDataSourceResponseBuilderOps(val self: UpdateDataSourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala(value: Option[DataSource]): UpdateDataSourceResponse.Builder = {
    value.fold(self) { v =>
      self.dataSource(v)
    }
  }

}

final class UpdateDataSourceResponseOps(val self: UpdateDataSourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceAsScala: Option[DataSource] = Option(self.dataSource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateDataSourceResponseOps {

  implicit def toUpdateDataSourceResponseBuilderOps(
      v: UpdateDataSourceResponse.Builder
  ): UpdateDataSourceResponseBuilderOps = new UpdateDataSourceResponseBuilderOps(v)

  implicit def toUpdateDataSourceResponseOps(v: UpdateDataSourceResponse): UpdateDataSourceResponseOps =
    new UpdateDataSourceResponseOps(v)

}
