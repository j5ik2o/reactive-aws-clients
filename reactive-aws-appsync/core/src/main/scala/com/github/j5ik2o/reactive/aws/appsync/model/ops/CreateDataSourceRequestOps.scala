// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateDataSourceRequestBuilderOps(val self: CreateDataSourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[DataSourceType]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceRoleArnAsScala(value: Option[String]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchConfigAsScala(
      value: Option[ElasticsearchDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def relationalDatabaseConfigAsScala(
      value: Option[RelationalDatabaseDataSourceConfig]
  ): CreateDataSourceRequest.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  }

}

final class CreateDataSourceRequestOps(val self: CreateDataSourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

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
trait ToCreateDataSourceRequestOps {

  implicit def toCreateDataSourceRequestBuilderOps(
      v: CreateDataSourceRequest.Builder
  ): CreateDataSourceRequestBuilderOps = new CreateDataSourceRequestBuilderOps(v)

  implicit def toCreateDataSourceRequestOps(v: CreateDataSourceRequest): CreateDataSourceRequestOps =
    new CreateDataSourceRequestOps(v)

}
