// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class AwsIamConfigBuilderOps(val self: AwsIamConfig.Builder) extends AnyVal {

  final def signingRegionAsScala(value: Option[String]): AwsIamConfig.Builder = {
    value.fold(self) { v =>
      self.signingRegion(v)
    }
  }

  final def signingServiceNameAsScala(value: Option[String]): AwsIamConfig.Builder = {
    value.fold(self) { v =>
      self.signingServiceName(v)
    }
  }

}

final class AwsIamConfigOps(val self: AwsIamConfig) extends AnyVal {

  final def signingRegionAsScala: Option[String] = Option(self.signingRegion)

  final def signingServiceNameAsScala: Option[String] = Option(self.signingServiceName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAwsIamConfigOps {

  implicit def toAwsIamConfigBuilderOps(v: AwsIamConfig.Builder): AwsIamConfigBuilderOps = new AwsIamConfigBuilderOps(v)

  implicit def toAwsIamConfigOps(v: AwsIamConfig): AwsIamConfigOps = new AwsIamConfigOps(v)

}
