// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeElasticsearchDomainRequestBuilderOps(val self: UpgradeElasticsearchDomainRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala(value: Option[String]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.targetVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def performCheckOnlyAsScala(value: Option[Boolean]): UpgradeElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.performCheckOnly(v)
    }
  }

}

final class UpgradeElasticsearchDomainRequestOps(val self: UpgradeElasticsearchDomainRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala: Option[String] = Option(self.targetVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def performCheckOnlyAsScala: Option[Boolean] = Option(self.performCheckOnly)

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
