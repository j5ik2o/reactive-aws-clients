// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DataSourceBuilderOps(val self: DataSource.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v => self.dataSourceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[DataSourceType]): DataSource.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v => self.serviceRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v => self.dynamodbConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v => self.lambdaConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchConfigAsScala(value: Option[ElasticsearchDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v => self.elasticsearchConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v => self.httpConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def relationalDatabaseConfigAsScala(value: Option[RelationalDatabaseDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v => self.relationalDatabaseConfig(v) }
  }

}

final class DataSourceOps(val self: DataSource) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceArnAsScala: Option[String] = Option(self.dataSourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[DataSourceType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleArnAsScala: Option[String] = Option(self.serviceRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dynamodbConfigAsScala: Option[DynamodbDataSourceConfig] = Option(self.dynamodbConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConfigAsScala: Option[LambdaDataSourceConfig] = Option(self.lambdaConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchConfigAsScala: Option[ElasticsearchDataSourceConfig] = Option(self.elasticsearchConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpConfigAsScala: Option[HttpDataSourceConfig] = Option(self.httpConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def relationalDatabaseConfigAsScala: Option[RelationalDatabaseDataSourceConfig] =
    Option(self.relationalDatabaseConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDataSourceOps {

  implicit def toDataSourceBuilderOps(v: DataSource.Builder): DataSourceBuilderOps = new DataSourceBuilderOps(v)

  implicit def toDataSourceOps(v: DataSource): DataSourceOps = new DataSourceOps(v)

}
