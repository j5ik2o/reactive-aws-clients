// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class RelationalDatabaseDataSourceConfigBuilderOps(val self: RelationalDatabaseDataSourceConfig.Builder)
    extends AnyVal {

  final def relationalDatabaseSourceTypeAsScala(
      value: Option[RelationalDatabaseSourceType]
  ): RelationalDatabaseDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseSourceType(v)
    }
  }

  final def rdsHttpEndpointConfigAsScala(
      value: Option[RdsHttpEndpointConfig]
  ): RelationalDatabaseDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.rdsHttpEndpointConfig(v)
    }
  }

}

final class RelationalDatabaseDataSourceConfigOps(val self: RelationalDatabaseDataSourceConfig) extends AnyVal {

  final def relationalDatabaseSourceTypeAsScala: Option[RelationalDatabaseSourceType] =
    Option(self.relationalDatabaseSourceType)

  final def rdsHttpEndpointConfigAsScala: Option[RdsHttpEndpointConfig] = Option(self.rdsHttpEndpointConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRelationalDatabaseDataSourceConfigOps {

  implicit def toRelationalDatabaseDataSourceConfigBuilderOps(
      v: RelationalDatabaseDataSourceConfig.Builder
  ): RelationalDatabaseDataSourceConfigBuilderOps = new RelationalDatabaseDataSourceConfigBuilderOps(v)

  implicit def toRelationalDatabaseDataSourceConfigOps(
      v: RelationalDatabaseDataSourceConfig
  ): RelationalDatabaseDataSourceConfigOps = new RelationalDatabaseDataSourceConfigOps(v)

}
