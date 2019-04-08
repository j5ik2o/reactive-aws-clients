// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PublicAccessBlockConfigurationBuilderOps(val self: PublicAccessBlockConfiguration.Builder) extends AnyVal {

  final def blockPublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicAcls(v)
    }
  }

  final def ignorePublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.ignorePublicAcls(v)
    }
  }

  final def blockPublicPolicyAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicPolicy(v)
    }
  }

  final def restrictPublicBucketsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.restrictPublicBuckets(v)
    }
  }

}

final class PublicAccessBlockConfigurationOps(val self: PublicAccessBlockConfiguration) extends AnyVal {

  final def blockPublicAclsAsScala: Option[Boolean] = Option(self.blockPublicAcls)

  final def ignorePublicAclsAsScala: Option[Boolean] = Option(self.ignorePublicAcls)

  final def blockPublicPolicyAsScala: Option[Boolean] = Option(self.blockPublicPolicy)

  final def restrictPublicBucketsAsScala: Option[Boolean] = Option(self.restrictPublicBuckets)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublicAccessBlockConfigurationOps {

  implicit def toPublicAccessBlockConfigurationBuilderOps(
      v: PublicAccessBlockConfiguration.Builder
  ): PublicAccessBlockConfigurationBuilderOps = new PublicAccessBlockConfigurationBuilderOps(v)

  implicit def toPublicAccessBlockConfigurationOps(
      v: PublicAccessBlockConfiguration
  ): PublicAccessBlockConfigurationOps = new PublicAccessBlockConfigurationOps(v)

}
