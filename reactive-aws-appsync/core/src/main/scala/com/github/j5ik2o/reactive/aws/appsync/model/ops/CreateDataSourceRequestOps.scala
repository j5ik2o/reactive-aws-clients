// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateDataSourceRequestBuilderOps(val self: CreateDataSourceRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def typeAsScala(value: Option[DataSourceType]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def serviceRoleArnAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  } // String

  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  } // DynamodbDataSourceConfig

  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  } // LambdaDataSourceConfig

  final def elasticsearchConfigAsScala(
      value: Option[ElasticsearchDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  } // ElasticsearchDataSourceConfig

  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  } // HttpDataSourceConfig

  final def relationalDatabaseConfigAsScala(
      value: Option[RelationalDatabaseDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  } // RelationalDatabaseDataSourceConfig

}

final class CreateDataSourceRequestOps(val self: CreateDataSourceRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def typeAsScala: Option[DataSourceType] = Option(self.`type`) // String

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
trait ToCreateDataSourceRequestOps {

  implicit def toCreateDataSourceRequestBuilderOps(
      v: CreateDataSourceRequest.Builder
  ): CreateDataSourceRequestBuilderOps = new CreateDataSourceRequestBuilderOps(v)

  implicit def toCreateDataSourceRequestOps(v: CreateDataSourceRequest): CreateDataSourceRequestOps =
    new CreateDataSourceRequestOps(v)

}
