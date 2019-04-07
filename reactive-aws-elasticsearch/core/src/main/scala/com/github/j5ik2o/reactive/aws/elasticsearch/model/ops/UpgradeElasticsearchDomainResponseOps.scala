// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeElasticsearchDomainResponseBuilderOps(val self: UpgradeElasticsearchDomainResponse.Builder)
    extends AnyVal {

  final def withDomainNameAsScala(value: Option[String]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

  final def withTargetVersionAsScala(value: Option[String]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v =>
      self.targetVersion(v)
    }
  } // String

  final def withPerformCheckOnlyAsScala(value: Option[Boolean]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v =>
      self.performCheckOnly(v)
    }
  } // Boolean

}

final class UpgradeElasticsearchDomainResponseOps(val self: UpgradeElasticsearchDomainResponse) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

  final def targetVersionAsScala: Option[String] = Option(self.targetVersion) // String

  final def performCheckOnlyAsScala: Option[Boolean] = Option(self.performCheckOnly) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpgradeElasticsearchDomainResponseOps {

  implicit def toUpgradeElasticsearchDomainResponseBuilderOps(
      v: UpgradeElasticsearchDomainResponse.Builder
  ): UpgradeElasticsearchDomainResponseBuilderOps = new UpgradeElasticsearchDomainResponseBuilderOps(v)

  implicit def toUpgradeElasticsearchDomainResponseOps(
      v: UpgradeElasticsearchDomainResponse
  ): UpgradeElasticsearchDomainResponseOps = new UpgradeElasticsearchDomainResponseOps(v)

}
