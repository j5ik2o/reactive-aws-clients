// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DataSourceBuilderOps(val self: DataSource.Builder) extends AnyVal {

  final def dataSourceArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.dataSourceArn(v)
    }
  }

  final def nameAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def typeAsScala(value: Option[DataSourceType]): DataSource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def serviceRoleArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  }

  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  }

  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  }

  final def elasticsearchConfigAsScala(value: Option[ElasticsearchDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  }

  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  }

  final def relationalDatabaseConfigAsScala(value: Option[RelationalDatabaseDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  }

}

final class DataSourceOps(val self: DataSource) extends AnyVal {

  final def dataSourceArnAsScala: Option[String] = Option(self.dataSourceArn)

  final def nameAsScala: Option[String] = Option(self.name)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def typeAsScala: Option[DataSourceType] = Option(self.`type`)

  final def serviceRoleArnAsScala: Option[String] = Option(self.serviceRoleArn)

  final def dynamodbConfigAsScala: Option[DynamodbDataSourceConfig] = Option(self.dynamodbConfig)

  final def lambdaConfigAsScala: Option[LambdaDataSourceConfig] = Option(self.lambdaConfig)

  final def elasticsearchConfigAsScala: Option[ElasticsearchDataSourceConfig] = Option(self.elasticsearchConfig)

  final def httpConfigAsScala: Option[HttpDataSourceConfig] = Option(self.httpConfig)

  final def relationalDatabaseConfigAsScala: Option[RelationalDatabaseDataSourceConfig] =
    Option(self.relationalDatabaseConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDataSourceOps {

  implicit def toDataSourceBuilderOps(v: DataSource.Builder): DataSourceBuilderOps = new DataSourceBuilderOps(v)

  implicit def toDataSourceOps(v: DataSource): DataSourceOps = new DataSourceOps(v)

}
