// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeElasticsearchDomainRequestBuilderOps(val self: UpgradeElasticsearchDomainRequest.Builder)
    extends AnyVal {

  final def domainNameAsScala(value: Option[String]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def targetVersionAsScala(value: Option[String]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.targetVersion(v)
    }
  } // String

  final def performCheckOnlyAsScala(value: Option[Boolean]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.performCheckOnly(v)
    }
  } // Boolean

}

final class UpgradeElasticsearchDomainRequestOps(val self: UpgradeElasticsearchDomainRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def targetVersionAsScala: Option[String] = Option(self.targetVersion) // String

  final def performCheckOnlyAsScala: Option[Boolean] = Option(self.performCheckOnly) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeElasticsearchDomainRequestOps {

  implicit def toUpgradeElasticsearchDomainRequestBuilderOps(
      v: UpgradeElasticsearchDomainRequest.Builder
  ): UpgradeElasticsearchDomainRequestBuilderOps = new UpgradeElasticsearchDomainRequestBuilderOps(v)

  implicit def toUpgradeElasticsearchDomainRequestOps(
      v: UpgradeElasticsearchDomainRequest
  ): UpgradeElasticsearchDomainRequestOps = new UpgradeElasticsearchDomainRequestOps(v)

}
