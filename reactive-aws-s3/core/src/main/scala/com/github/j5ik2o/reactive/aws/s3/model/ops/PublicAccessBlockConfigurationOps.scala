// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PublicAccessBlockConfigurationBuilderOps(val self: PublicAccessBlockConfiguration.Builder) extends AnyVal {

  final def withBlockPublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicAcls(v)
    }
  } // Boolean

  final def withIgnorePublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.ignorePublicAcls(v)
    }
  } // Boolean

  final def withBlockPublicPolicyAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicPolicy(v)
    }
  } // Boolean

  final def withRestrictPublicBucketsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.restrictPublicBuckets(v)
    }
  } // Boolean

}

final class PublicAccessBlockConfigurationOps(val self: PublicAccessBlockConfiguration) extends AnyVal {

  final def blockPublicAclsAsScala: Option[Boolean] = Option(self.blockPublicAcls) // Boolean

  final def ignorePublicAclsAsScala: Option[Boolean] = Option(self.ignorePublicAcls) // Boolean

  final def blockPublicPolicyAsScala: Option[Boolean] = Option(self.blockPublicPolicy) // Boolean

  final def restrictPublicBucketsAsScala: Option[Boolean] = Option(self.restrictPublicBuckets) // Boolean

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
