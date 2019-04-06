// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ElasticsearchDataSourceConfigBuilderOps(val self: ElasticsearchDataSourceConfig.Builder) extends AnyVal {

  final def withEndpointAsScala(value: Option[String]): ElasticsearchDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  } // String

  final def withAwsRegionAsScala(value: Option[String]): ElasticsearchDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  } // String

}

final class ElasticsearchDataSourceConfigOps(val self: ElasticsearchDataSourceConfig) extends AnyVal {

  final def endpointAsScala: Option[String] = Option(self.endpoint) // String

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticsearchDataSourceConfigOps {

  implicit def toElasticsearchDataSourceConfigBuilderOps(
      v: ElasticsearchDataSourceConfig.Builder
  ): ElasticsearchDataSourceConfigBuilderOps = new ElasticsearchDataSourceConfigBuilderOps(v)

  implicit def toElasticsearchDataSourceConfigOps(v: ElasticsearchDataSourceConfig): ElasticsearchDataSourceConfigOps =
    new ElasticsearchDataSourceConfigOps(v)

}
