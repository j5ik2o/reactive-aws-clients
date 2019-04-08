// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateDataSourceRequestBuilderOps(val self: UpdateDataSourceRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def typeAsScala(value: Option[DataSourceType]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // DataSourceType

  final def serviceRoleArnAsScala(value: Option[String]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  } // String

  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  } // DynamodbDataSourceConfig

  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  } // LambdaDataSourceConfig

  final def elasticsearchConfigAsScala(
      value: Option[ElasticsearchDataSourceConfig]
  ): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  } // ElasticsearchDataSourceConfig

  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  } // HttpDataSourceConfig

  final def relationalDatabaseConfigAsScala(
      value: Option[RelationalDatabaseDataSourceConfig]
  ): UpdateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  } // RelationalDatabaseDataSourceConfig

}

final class UpdateDataSourceRequestOps(val self: UpdateDataSourceRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def typeAsScala: Option[DataSourceType] = Option(self.`type`) // DataSourceType

  final def serviceRoleArnAsScala: Option[String] = Option(self.serviceRoleArn) // String

  final def dynamodbConfigAsScala: Option[DynamodbDataSourceConfig] =
    Option(self.dynamodbConfig) // DynamodbDataSourceConfig

  final def lambdaConfigAsScala: Option[LambdaDataSourceConfig] = Option(self.lambdaConfig) // LambdaDataSourceConfig

  final def elasticsearchConfigAsScala: Option[ElasticsearchDataSourceConfig] =
    Option(self.elasticsearchConfig) // ElasticsearchDataSourceConfig

  final def httpConfigAsScala: Option[HttpDataSourceConfig] = Option(self.httpConfig) // HttpDataSourceConfig

  final def relationalDatabaseConfigAsScala: Option[RelationalDatabaseDataSourceConfig] =
    Option(self.relationalDatabaseConfig) // RelationalDatabaseDataSourceConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateDataSourceRequestOps {

  implicit def toUpdateDataSourceRequestBuilderOps(
      v: UpdateDataSourceRequest.Builder
  ): UpdateDataSourceRequestBuilderOps = new UpdateDataSourceRequestBuilderOps(v)

  implicit def toUpdateDataSourceRequestOps(v: UpdateDataSourceRequest): UpdateDataSourceRequestOps =
    new UpdateDataSourceRequestOps(v)

}
