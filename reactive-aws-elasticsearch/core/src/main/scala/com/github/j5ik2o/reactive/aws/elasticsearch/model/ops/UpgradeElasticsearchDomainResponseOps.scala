// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpgradeElasticsearchDomainResponseBuilderOps(val self: UpgradeElasticsearchDomainResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala(value: Option[String]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v => self.targetVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def performCheckOnlyAsScala(value: Option[Boolean]): UpgradeElasticsearchDomainResponse.Builder = {
    value.fold(self) { v => self.performCheckOnly(v) }
  }

}

final class UpgradeElasticsearchDomainResponseOps(val self: UpgradeElasticsearchDomainResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala: Option[String] = Option(self.targetVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def performCheckOnlyAsScala: Option[Boolean] = Option(self.performCheckOnly)

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
