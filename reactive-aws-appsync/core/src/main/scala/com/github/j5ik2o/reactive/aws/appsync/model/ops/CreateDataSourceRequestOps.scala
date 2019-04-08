// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateDataSourceRequestBuilderOps(val self: CreateDataSourceRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def nameAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def typeAsScala(value: Option[DataSourceType]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def serviceRoleArnAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  }

  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  }

  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  }

  final def elasticsearchConfigAsScala(
      value: Option[ElasticsearchDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  }

  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  }

  final def relationalDatabaseConfigAsScala(
      value: Option[RelationalDatabaseDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  }

}

final class CreateDataSourceRequestOps(val self: CreateDataSourceRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

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
trait ToCreateDataSourceRequestOps {

  implicit def toCreateDataSourceRequestBuilderOps(
      v: CreateDataSourceRequest.Builder
  ): CreateDataSourceRequestBuilderOps = new CreateDataSourceRequestBuilderOps(v)

  implicit def toCreateDataSourceRequestOps(v: CreateDataSourceRequest): CreateDataSourceRequestOps =
    new CreateDataSourceRequestOps(v)

}
