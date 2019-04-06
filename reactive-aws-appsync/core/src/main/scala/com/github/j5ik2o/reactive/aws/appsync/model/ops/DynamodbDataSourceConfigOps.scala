// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DynamodbDataSourceConfigBuilderOps(val self: DynamodbDataSourceConfig.Builder) extends AnyVal {

  final def withTableNameAsScala(value: Option[String]): DynamodbDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withAwsRegionAsScala(value: Option[String]): DynamodbDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  } // String

  final def withUseCallerCredentialsAsScala(value: Option[Boolean]): DynamodbDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.useCallerCredentials(v)
    }
  } // Boolean

}

final class DynamodbDataSourceConfigOps(val self: DynamodbDataSourceConfig) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion) // String

  final def useCallerCredentialsAsScala: Option[Boolean] = Option(self.useCallerCredentials) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDynamodbDataSourceConfigOps {

  implicit def toDynamodbDataSourceConfigBuilderOps(
      v: DynamodbDataSourceConfig.Builder
  ): DynamodbDataSourceConfigBuilderOps = new DynamodbDataSourceConfigBuilderOps(v)

  implicit def toDynamodbDataSourceConfigOps(v: DynamodbDataSourceConfig): DynamodbDataSourceConfigOps =
    new DynamodbDataSourceConfigOps(v)

}
