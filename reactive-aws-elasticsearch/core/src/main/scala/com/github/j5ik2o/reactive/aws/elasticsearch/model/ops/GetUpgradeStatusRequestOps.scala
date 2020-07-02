// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class GetUpgradeStatusRequestBuilderOps(val self: GetUpgradeStatusRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): GetUpgradeStatusRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class GetUpgradeStatusRequestOps(val self: GetUpgradeStatusRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetUpgradeStatusRequestOps {

  implicit def toGetUpgradeStatusRequestBuilderOps(
      v: GetUpgradeStatusRequest.Builder
  ): GetUpgradeStatusRequestBuilderOps = new GetUpgradeStatusRequestBuilderOps(v)

  implicit def toGetUpgradeStatusRequestOps(v: GetUpgradeStatusRequest): GetUpgradeStatusRequestOps =
    new GetUpgradeStatusRequestOps(v)

}
