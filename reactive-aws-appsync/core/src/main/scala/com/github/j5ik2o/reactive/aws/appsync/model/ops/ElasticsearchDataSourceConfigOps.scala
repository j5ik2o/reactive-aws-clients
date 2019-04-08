// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ElasticsearchDataSourceConfigBuilderOps(val self: ElasticsearchDataSourceConfig.Builder) extends AnyVal {

  final def endpointAsScala(value: Option[String]): ElasticsearchDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  final def awsRegionAsScala(value: Option[String]): ElasticsearchDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  }

}

final class ElasticsearchDataSourceConfigOps(val self: ElasticsearchDataSourceConfig) extends AnyVal {

  final def endpointAsScala: Option[String] = Option(self.endpoint)

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDataSourceConfigOps {

  implicit def toElasticsearchDataSourceConfigBuilderOps(
      v: ElasticsearchDataSourceConfig.Builder
  ): ElasticsearchDataSourceConfigBuilderOps = new ElasticsearchDataSourceConfigBuilderOps(v)

  implicit def toElasticsearchDataSourceConfigOps(v: ElasticsearchDataSourceConfig): ElasticsearchDataSourceConfigOps =
    new ElasticsearchDataSourceConfigOps(v)

}
